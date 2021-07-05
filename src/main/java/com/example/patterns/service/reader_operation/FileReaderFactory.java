package com.example.patterns.service.reader_operation;

import com.example.patterns.exceptions.UnsupportedFileTypeException;
import com.example.patterns.service.FileReader;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;

@Service
public class FileReaderFactory {
    private EnumMap<FileType, FileReader> fileReaders;

    public FileReaderFactory(List<FileReader> fileReaderList) {
        fileReaders = new EnumMap<>(FileType.class);
        fileReaderList.forEach(reader -> fileReaders.put(reader.getSupportedFileType(), reader));
    }

    public FileReader getFileReader(String extension) {
        try {
            return fileReaders.get(FileType.fileTypeOf(extension));
        } catch (UnsupportedFileTypeException e) {
            e.printStackTrace();
            return null;
        }
    }
}

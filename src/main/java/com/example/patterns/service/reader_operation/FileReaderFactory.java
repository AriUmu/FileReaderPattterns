package com.example.patterns.service.reader_operation;

import com.example.patterns.exceptions.UnsupportedFileTypeException;
import com.example.patterns.service.FileReader;
import com.example.patterns.service.impl.CsvReader;
import com.example.patterns.service.impl.ExcelReader;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

@Service
@Getter
public class FileReaderFactory {

    private EnumMap<FileType, FileReader> fileReaders;
    private static List<FileReader> readers = new ArrayList<>();

     static  {
        readers.add(new CsvReader());
        readers.add(new ExcelReader());
    }

    public FileReaderFactory() {
        fileReaders = new EnumMap<>(FileType.class);
        readers.forEach(reader -> fileReaders.put(reader.getSupportedFileType(), reader));
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

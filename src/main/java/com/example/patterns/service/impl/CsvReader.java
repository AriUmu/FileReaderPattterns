package com.example.patterns.service.impl;

import com.example.patterns.service.FileReader;
import com.example.patterns.service.reader_operation.FileType;
import org.springframework.stereotype.Component;

@Component
public class CsvReader implements FileReader {

    @Override
    public FileType getSupportedFileType() {
        return FileType.CSV;
    }

    @Override
    public String readFile(String filePath) {
        System.out.println(String.format("CsvReader --> Reading file: %s", filePath));
        return filePath;
    }
}

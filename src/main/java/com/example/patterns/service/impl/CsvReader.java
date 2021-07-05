package com.example.patterns.service.impl;

import com.example.patterns.service.FileReader;
import com.example.patterns.service.reader_operation.FileType;
import org.springframework.stereotype.Service;

@Service
public class CsvReader extends FileReader {

    public CsvReader(){
        super(FileType.CSV);
    }

    @Override
    public String readFile(String filePath) {
        System.out.println(String.format("CsvReader --> Reading file: %s", filePath));
        return filePath;
    }
}

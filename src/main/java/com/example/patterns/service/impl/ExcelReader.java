package com.example.patterns.service.impl;

import com.example.patterns.service.FileReader;
import com.example.patterns.service.reader_operation.FileType;
import org.springframework.stereotype.Service;

@Service
public class ExcelReader extends FileReader {

    public ExcelReader() {
        super(FileType.EXCEL);
    }

    @Override
    public String readFile(String filePath) {
        System.out.println(String.format("ExcelReader --> Reading file: %s", filePath));
        return filePath;
    }
}

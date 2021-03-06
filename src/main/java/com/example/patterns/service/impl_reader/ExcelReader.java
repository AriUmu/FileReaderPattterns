package com.example.patterns.service.impl_reader;

import com.example.patterns.service.FileReader;
import com.example.patterns.service.reader_operation.FileType;
import org.springframework.stereotype.Component;

@Component
public class ExcelReader implements FileReader {

    @Override
    public FileType getSupportedFileType() {
        return FileType.EXCEL;
    }

    @Override
    public String readFile(String filePath) {
        System.out.println(String.format("ExcelReader --> Reading file: %s", filePath));
        return filePath;
    }
}

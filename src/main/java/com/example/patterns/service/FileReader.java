package com.example.patterns.service;

import com.example.patterns.service.reader_operation.FileType;

public interface FileReader {

    FileType getSupportedFileType();

    public abstract String readFile(String filePath);
}

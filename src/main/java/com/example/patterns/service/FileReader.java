package com.example.patterns.service;

import com.example.patterns.service.reader_operation.FileType;

public abstract class FileReader {
    private FileType supportedFileType;

    public FileReader(FileType supportedFileType){
        this.supportedFileType = supportedFileType;
    }

    public FileType getSupportedFileType(){
        return supportedFileType;
    }

    public abstract String readFile(String filePath);
}

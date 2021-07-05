package com.example.patterns.service.reader_operation;

import com.example.patterns.exceptions.UnsupportedFileTypeException;

import java.util.Arrays;

public enum FileType {
    CSV("csv"),
    EXCEL("xlsx"),
    PDF("pdf");

    FileType(String extension){
        this.extension = extension;
    }

    private String extension;

    public static FileType fileTypeOf(String extension) throws UnsupportedFileTypeException {
        return Arrays.stream(values())
                .filter(file -> file.extension.equals(extension))
                .findFirst()
                .orElseThrow(() -> new UnsupportedFileTypeException(extension));
    }
}

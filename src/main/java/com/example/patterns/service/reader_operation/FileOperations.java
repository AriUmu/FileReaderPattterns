package com.example.patterns.service.reader_operation;

public class FileOperations {

    private FileReaderFactory readerFactory;

    public String readFile(String filePath) {
        return readerFactory.getFileReader(getExtensionOfFile(filePath)).readFile(filePath);
    }

    private static String getExtensionOfFile(String filePath) {
        /**
         * logic
         */
        return filePath.substring(filePath.length() - 4, filePath.length() - 1);
    }
}

package com.example.patterns.exceptions;

public class UnsupportedFileTypeException extends Exception{
    public UnsupportedFileTypeException(String message) {
        super(message);
    }
}

package com.epam.mjc;

public class CustomException extends IllegalArgumentException {
    public CustomException(String m, Throwable e) {
        super(m, e);
    }
}

package com.company.MonthandMath.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super();
    }

    public NotFoundException(String msg) {
        super(msg);
    }
}

package com.killerexpertise.crud.example.exception;

public class DealerNotFoundException extends RuntimeException {
    public DealerNotFoundException(String msg) {
        super(msg);
    }
}

package com.coca.service.exceptions;

public class RedisLockException extends CheckedException {

    public RedisLockException(String message) {
        super(message);
    }

}

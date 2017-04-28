package com.vipjoy.joy.service.exceptions;

public class RedisLockException extends CheckedException {

    public RedisLockException(String message) {
        super(message);
    }

}

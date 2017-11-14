package com.vipjoy.joy.api.exceptions;

public class RedisLockException extends CheckedException {

    public RedisLockException(String message) {
        super(message);
    }

}

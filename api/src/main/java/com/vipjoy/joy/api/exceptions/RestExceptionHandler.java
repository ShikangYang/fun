package com.vipjoy.joy.api.exceptions;


import com.google.common.base.Throwables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages = "com.vipjoy.joy.api")
public class RestExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class.getSimpleName());

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error handleNotFoundException(NotFoundException e) {
        return new Error(e.getMessage());
    }

    @ExceptionHandler(IllegalException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public Error handleIllegalException(IllegalException e) {
        logger.error("exception {}", Throwables.getStackTraceAsString(e));
        return new Error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Error handleException(Exception e) {
        logger.error("exception {}", Throwables.getStackTraceAsString(e));
        return new Error(e.getMessage());
    }


    private static final class Error {
        String msg;

        public Error(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

    }
}

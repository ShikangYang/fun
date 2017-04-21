package com.coca.fun.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController extends BaseController {

    @RequestMapping(value = "/hello")
    public String helloWorld() {
        logger.info("hello");
        return "hello world";
    }
}

package com.ming.awsjenkins.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("hello2")
public class Controller {
    @RequestMapping("")
    public String hello() {
        return "helloworld1";

    }
}

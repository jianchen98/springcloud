package com.example.hello1.com.example.hello1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/17.
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String  gethello(){
        return "hello";
    }
}

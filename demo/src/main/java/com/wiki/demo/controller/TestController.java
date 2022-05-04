package com.wiki.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //测试
    @Value("$test.hello:Test")
    private String testHello;

//    @GetMapping("/hello")
    @RequestMapping("/hello")
    public String hello(){
        return "aaa"+testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return name + "post";
    }
}

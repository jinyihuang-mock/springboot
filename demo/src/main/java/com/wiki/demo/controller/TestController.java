package com.wiki.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @GetMapping("/hello")
    @RequestMapping("/hello")
    public String hello(){
        return "aaa";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return name + "post";
    }
}

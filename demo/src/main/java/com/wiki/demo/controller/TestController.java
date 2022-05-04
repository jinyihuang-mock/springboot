package com.wiki.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@PropertySource(value = "classpath:application.properties")
public class TestController {

    //测试
    @Value("$test")
//    @Autowired
    private String test;

//    @GetMapping("/hello")


    @RequestMapping("/hello")
    public String hello(){
        return "aaa"+test;
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){
        return name + "post";
    }
}

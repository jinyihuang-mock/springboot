package com.wiki.demo.controller;

import com.wiki.demo.domain.Test;
import com.wiki.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@PropertySource(value = "classpath:application.properties")
public class TestController {

    //测试
    @Value("$test")
//    @Autowired
    private String test;

    //引入Service
    @Autowired
    private TestService testService;



//    @GetMapping("/hello")


    @RequestMapping("/hello")
    public String hello(){
        return "aaa"+test;
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){
        return name + "post";
    }

    @RequestMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}

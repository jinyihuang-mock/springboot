package com.wiki.demo.controller;

import com.wiki.demo.domain.Demo;
import com.wiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@PropertySource(value = "classpath:application.properties")
@RequestMapping("/demo")
public class DemoController {

    //测试
    @Value("$demo")
//    @Autowired
    private String demo;

    //引入Service
    @Autowired
    private DemoService demoService;



//    @GetMapping("/hello")


//    @RequestMapping("/hello")
//    public String hello(){
//        return "aaa"+demo;
//    }

//
//    @PostMapping("/hello/post")
//    public String helloPost(String name){
//        return name + "post";
//    }

    @RequestMapping("/list1")
    public List<Demo> list(){
        return demoService.list();
    }

}

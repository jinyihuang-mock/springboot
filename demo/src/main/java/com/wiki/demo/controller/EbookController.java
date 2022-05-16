package com.wiki.demo.controller;

import com.wiki.demo.domain.Ebook;
import com.wiki.demo.service.EbookService;
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
@RequestMapping("/ebook")
public class EbookController {

    //测试
    @Value("$ebook")
//    @Autowired
    private String ebook;

    //引入Service
    @Autowired
    private EbookService ebookService;

    
    @RequestMapping("/list1")
    public List<Ebook> list(){
        return ebookService.list();
    }

}

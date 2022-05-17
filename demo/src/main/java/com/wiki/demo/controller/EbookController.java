package com.wiki.demo.controller;

import com.wiki.demo.req.EbookReq;
import com.wiki.demo.resp.CommonResp;
import com.wiki.demo.resp.EbookResp;
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

    
    @RequestMapping("/list")
//    public CommonResp list(String name){
//        CommonResp<List<Ebook>> resp = new CommonResp<>();
//        List<Ebook> list =  ebookService.list(name);
//        resp.setContent(list);
//        return resp;
//    }
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list =  ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

}

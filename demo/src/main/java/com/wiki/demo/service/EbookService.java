package com.wiki.demo.service;

import com.wiki.demo.domain.Ebook;
import com.wiki.demo.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
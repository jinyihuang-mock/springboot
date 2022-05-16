package com.wiki.demo.service;

import com.wiki.demo.domain.Test;
import com.wiki.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.selectByExample(null);
    }
}

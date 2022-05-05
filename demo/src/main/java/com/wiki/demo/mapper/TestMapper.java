package com.wiki.demo.mapper;

import com.wiki.demo.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    public List<Test> list();
}

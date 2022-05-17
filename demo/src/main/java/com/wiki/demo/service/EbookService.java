package com.wiki.demo.service;

import com.wiki.demo.domain.Ebook;
import com.wiki.demo.domain.EbookExample;
import com.wiki.demo.mapper.EbookMapper;
import com.wiki.demo.req.EbookReq;
import com.wiki.demo.resp.EbookResp;
import com.wiki.demo.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList =   ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook :ebookList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
//    public List<Ebook> list(String name){
//        EbookExample ebookExample = new EbookExample();
//        EbookExample.Criteria criteria = ebookExample.createCriteria();
//        criteria.andNameLike("%"+name+"%");
//        return ebookMapper.selectByExample(ebookExample);
//    }
}

package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsWord;
import com.cms.service.mapper.cms.CmsWordMapper;

@Service
public class CmsWordServiceImpl {

    @Resource
    private CmsWordMapper cmsWordMapper;

    public int insert(CmsWord pojo){
        return cmsWordMapper.insert(pojo);
    }

    public int insertList(List< CmsWord> pojos){
        return cmsWordMapper.insertList(pojos);
    }

    public List<CmsWord> select(CmsWord pojo){
        return cmsWordMapper.select(pojo);
    }

    public int update(CmsWord pojo){
        return cmsWordMapper.update(pojo);
    }

}

package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsContent;
import com.cms.service.mapper.cms.CmsContentMapper;

@Service
public class CmsContentServiceImpl {

    @Resource
    private CmsContentMapper cmsContentMapper;

    public int insert(CmsContent pojo){
        return cmsContentMapper.insert(pojo);
    }

    public int insertList(List< CmsContent> pojos){
        return cmsContentMapper.insertList(pojos);
    }

    public List<CmsContent> select(CmsContent pojo){
        return cmsContentMapper.select(pojo);
    }

    public int update(CmsContent pojo){
        return cmsContentMapper.update(pojo);
    }

}

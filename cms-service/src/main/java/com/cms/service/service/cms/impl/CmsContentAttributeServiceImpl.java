package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsContentAttribute;
import com.cms.service.mapper.cms.CmsContentAttributeMapper;

@Service
public class CmsContentAttributeServiceImpl {

    @Resource
    private CmsContentAttributeMapper cmsContentAttributeMapper;

    public int insert(CmsContentAttribute pojo){
        return cmsContentAttributeMapper.insert(pojo);
    }

    public int insertList(List< CmsContentAttribute> pojos){
        return cmsContentAttributeMapper.insertList(pojos);
    }

    public List<CmsContentAttribute> select(CmsContentAttribute pojo){
        return cmsContentAttributeMapper.select(pojo);
    }

    public int update(CmsContentAttribute pojo){
        return cmsContentAttributeMapper.update(pojo);
    }

}

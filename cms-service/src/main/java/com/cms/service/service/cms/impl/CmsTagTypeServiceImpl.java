package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsTagType;
import com.cms.service.mapper.cms.CmsTagTypeMapper;

@Service
public class CmsTagTypeServiceImpl {

    @Resource
    private CmsTagTypeMapper cmsTagTypeMapper;

    public int insert(CmsTagType pojo){
        return cmsTagTypeMapper.insert(pojo);
    }

    public int insertList(List< CmsTagType> pojos){
        return cmsTagTypeMapper.insertList(pojos);
    }

    public List<CmsTagType> select(CmsTagType pojo){
        return cmsTagTypeMapper.select(pojo);
    }

    public int update(CmsTagType pojo){
        return cmsTagTypeMapper.update(pojo);
    }

}

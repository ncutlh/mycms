package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsContentRelated;
import com.cms.service.mapper.cms.CmsContentRelatedMapper;

@Service
public class CmsContentRelatedServiceImpl {

    @Resource
    private CmsContentRelatedMapper cmsContentRelatedMapper;

    public int insert(CmsContentRelated pojo){
        return cmsContentRelatedMapper.insert(pojo);
    }

    public int insertList(List< CmsContentRelated> pojos){
        return cmsContentRelatedMapper.insertList(pojos);
    }

    public List<CmsContentRelated> select(CmsContentRelated pojo){
        return cmsContentRelatedMapper.select(pojo);
    }

    public int update(CmsContentRelated pojo){
        return cmsContentRelatedMapper.update(pojo);
    }

}

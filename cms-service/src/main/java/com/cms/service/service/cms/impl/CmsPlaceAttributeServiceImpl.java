package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsPlaceAttribute;
import com.cms.service.mapper.cms.CmsPlaceAttributeMapper;

@Service
public class CmsPlaceAttributeServiceImpl {

    @Resource
    private CmsPlaceAttributeMapper cmsPlaceAttributeMapper;

    public int insert(CmsPlaceAttribute pojo){
        return cmsPlaceAttributeMapper.insert(pojo);
    }

    public int insertList(List< CmsPlaceAttribute> pojos){
        return cmsPlaceAttributeMapper.insertList(pojos);
    }

    public List<CmsPlaceAttribute> select(CmsPlaceAttribute pojo){
        return cmsPlaceAttributeMapper.select(pojo);
    }

    public int update(CmsPlaceAttribute pojo){
        return cmsPlaceAttributeMapper.update(pojo);
    }

}

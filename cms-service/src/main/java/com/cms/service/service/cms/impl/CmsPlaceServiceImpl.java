package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsPlace;
import com.cms.service.mapper.cms.CmsPlaceMapper;

@Service
public class CmsPlaceServiceImpl {

    @Resource
    private CmsPlaceMapper cmsPlaceMapper;

    public int insert(CmsPlace pojo){
        return cmsPlaceMapper.insert(pojo);
    }

    public int insertList(List< CmsPlace> pojos){
        return cmsPlaceMapper.insertList(pojos);
    }

    public List<CmsPlace> select(CmsPlace pojo){
        return cmsPlaceMapper.select(pojo);
    }

    public int update(CmsPlace pojo){
        return cmsPlaceMapper.update(pojo);
    }

}

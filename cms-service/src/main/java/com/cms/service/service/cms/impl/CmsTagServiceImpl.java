package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsTag;
import com.cms.service.mapper.cms.CmsTagMapper;

@Service
public class CmsTagServiceImpl {

    @Resource
    private CmsTagMapper cmsTagMapper;

    public int insert(CmsTag pojo){
        return cmsTagMapper.insert(pojo);
    }

    public int insertList(List< CmsTag> pojos){
        return cmsTagMapper.insertList(pojos);
    }

    public List<CmsTag> select(CmsTag pojo){
        return cmsTagMapper.select(pojo);
    }

    public int update(CmsTag pojo){
        return cmsTagMapper.update(pojo);
    }

}

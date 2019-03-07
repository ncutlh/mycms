package com.cms.service.service.cms.impl;



import com.cms.pojo.cms.CmsCategoryModelId;
import com.cms.service.mapper.cms.CmsCategoryModelIdMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CmsCategoryModelIdServiceImpl {

    @Resource
    private CmsCategoryModelIdMapper cmsCategoryModelIdMapper;

    public int insert(CmsCategoryModelId pojo){
        return cmsCategoryModelIdMapper.insert(pojo);
    }

    public int insertList(List< CmsCategoryModelId> pojos){
        return cmsCategoryModelIdMapper.insertList(pojos);
    }

    public List<CmsCategoryModelId> select(CmsCategoryModelId pojo){
        return cmsCategoryModelIdMapper.select(pojo);
    }

    public int update(CmsCategoryModelId pojo){
        return cmsCategoryModelIdMapper.update(pojo);
    }

}

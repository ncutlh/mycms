package com.cms.service.service.cms.impl;

import com.cms.pojo.cms.CmsCategoryAttribute;
import com.cms.service.mapper.cms.CmsCategoryAttributeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



@Service
public class CmsCategoryAttributeServiceImpl {

    @Resource
    private CmsCategoryAttributeMapper cmsCategoryAttributeMapper;

    public int insert(CmsCategoryAttribute pojo){
        return cmsCategoryAttributeMapper.insert(pojo);
    }

    public int insertList(List< CmsCategoryAttribute> pojos){
        return cmsCategoryAttributeMapper.insertList(pojos);
    }

    public List<CmsCategoryAttribute> select(CmsCategoryAttribute pojo){
        return cmsCategoryAttributeMapper.select(pojo);
    }

    public int update(CmsCategoryAttribute pojo){
        return cmsCategoryAttributeMapper.update(pojo);
    }

}

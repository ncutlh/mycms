package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsCategoryType;
import com.cms.service.mapper.cms.CmsCategoryTypeMapper;

@Service
public class CmsCategoryTypeServiceImpl {

    @Resource
    private CmsCategoryTypeMapper cmsCategoryTypeMapper;

    public int insert(CmsCategoryType pojo){
        return cmsCategoryTypeMapper.insert(pojo);
    }

    public int insertList(List< CmsCategoryType> pojos){
        return cmsCategoryTypeMapper.insertList(pojos);
    }

    public List<CmsCategoryType> select(CmsCategoryType pojo){
        return cmsCategoryTypeMapper.select(pojo);
    }

    public int update(CmsCategoryType pojo){
        return cmsCategoryTypeMapper.update(pojo);
    }

}

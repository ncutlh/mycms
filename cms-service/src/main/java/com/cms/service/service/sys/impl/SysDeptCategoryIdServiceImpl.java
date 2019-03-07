package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDeptCategoryId;
import com.cms.service.mapper.sys.SysDeptCategoryIdMapper;

@Service
public class SysDeptCategoryIdServiceImpl {

    @Resource
    private SysDeptCategoryIdMapper sysDeptCategoryIdMapper;

    public int insert(SysDeptCategoryId pojo){
        return sysDeptCategoryIdMapper.insert(pojo);
    }

    public int insertList(List< SysDeptCategoryId> pojos){
        return sysDeptCategoryIdMapper.insertList(pojos);
    }

    public List<SysDeptCategoryId> select(SysDeptCategoryId pojo){
        return sysDeptCategoryIdMapper.select(pojo);
    }

    public int update(SysDeptCategoryId pojo){
        return sysDeptCategoryIdMapper.update(pojo);
    }

}

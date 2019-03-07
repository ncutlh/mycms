package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDeptCategory;
import com.cms.service.mapper.sys.SysDeptCategoryMapper;

@Service
public class SysDeptCategoryServiceImpl {

    @Resource
    private SysDeptCategoryMapper sysDeptCategoryMapper;

    public int insert(SysDeptCategory pojo){
        return sysDeptCategoryMapper.insert(pojo);
    }

    public int insertList(List< SysDeptCategory> pojos){
        return sysDeptCategoryMapper.insertList(pojos);
    }

    public List<SysDeptCategory> select(SysDeptCategory pojo){
        return sysDeptCategoryMapper.select(pojo);
    }

    public int update(SysDeptCategory pojo){
        return sysDeptCategoryMapper.update(pojo);
    }

}

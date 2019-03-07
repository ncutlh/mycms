package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDept;
import com.cms.service.mapper.sys.SysDeptMapper;

@Service
public class SysDeptServiceImpl {

    @Resource
    private SysDeptMapper sysDeptMapper;

    public int insert(SysDept pojo){
        return sysDeptMapper.insert(pojo);
    }

    public int insertList(List< SysDept> pojos){
        return sysDeptMapper.insertList(pojos);
    }

    public List<SysDept> select(SysDept pojo){
        return sysDeptMapper.select(pojo);
    }

    public int update(SysDept pojo){
        return sysDeptMapper.update(pojo);
    }

}

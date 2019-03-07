package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDeptPageId;
import com.cms.service.mapper.sys.SysDeptPageIdMapper;

@Service
public class SysDeptPageIdServiceImpl {

    @Resource
    private SysDeptPageIdMapper sysDeptPageIdMapper;

    public int insert(SysDeptPageId pojo){
        return sysDeptPageIdMapper.insert(pojo);
    }

    public int insertList(List< SysDeptPageId> pojos){
        return sysDeptPageIdMapper.insertList(pojos);
    }

    public List<SysDeptPageId> select(SysDeptPageId pojo){
        return sysDeptPageIdMapper.select(pojo);
    }

    public int update(SysDeptPageId pojo){
        return sysDeptPageIdMapper.update(pojo);
    }

}

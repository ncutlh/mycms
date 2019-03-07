package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDeptConfigId;
import com.cms.service.mapper.sys.SysDeptConfigIdMapper;

@Service
public class SysDeptConfigIdServiceImpl {

    @Resource
    private SysDeptConfigIdMapper sysDeptConfigIdMapper;

    public int insert(SysDeptConfigId pojo){
        return sysDeptConfigIdMapper.insert(pojo);
    }

    public int insertList(List< SysDeptConfigId> pojos){
        return sysDeptConfigIdMapper.insertList(pojos);
    }

    public List<SysDeptConfigId> select(SysDeptConfigId pojo){
        return sysDeptConfigIdMapper.select(pojo);
    }

    public int update(SysDeptConfigId pojo){
        return sysDeptConfigIdMapper.update(pojo);
    }

}

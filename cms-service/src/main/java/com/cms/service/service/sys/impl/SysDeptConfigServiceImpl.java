package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDeptConfig;
import com.cms.service.mapper.sys.SysDeptConfigMapper;

@Service
public class SysDeptConfigServiceImpl {

    @Resource
    private SysDeptConfigMapper sysDeptConfigMapper;

    public int insert(SysDeptConfig pojo){
        return sysDeptConfigMapper.insert(pojo);
    }

    public int insertList(List< SysDeptConfig> pojos){
        return sysDeptConfigMapper.insertList(pojos);
    }

    public List<SysDeptConfig> select(SysDeptConfig pojo){
        return sysDeptConfigMapper.select(pojo);
    }

    public int update(SysDeptConfig pojo){
        return sysDeptConfigMapper.update(pojo);
    }

}

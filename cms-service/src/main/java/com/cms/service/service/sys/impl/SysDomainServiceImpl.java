package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDomain;
import com.cms.service.mapper.sys.SysDomainMapper;

@Service
public class SysDomainServiceImpl {

    @Resource
    private SysDomainMapper sysDomainMapper;

    public int insert(SysDomain pojo){
        return sysDomainMapper.insert(pojo);
    }

    public int insertList(List< SysDomain> pojos){
        return sysDomainMapper.insertList(pojos);
    }

    public List<SysDomain> select(SysDomain pojo){
        return sysDomainMapper.select(pojo);
    }

    public int update(SysDomain pojo){
        return sysDomainMapper.update(pojo);
    }

}

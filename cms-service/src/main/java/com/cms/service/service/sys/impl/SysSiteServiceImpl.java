package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysSite;
import com.cms.service.mapper.sys.SysSiteMapper;

@Service
public class SysSiteServiceImpl {

    @Resource
    private SysSiteMapper sysSiteMapper;

    public int insert(SysSite pojo){
        return sysSiteMapper.insert(pojo);
    }

    public int insertList(List< SysSite> pojos){
        return sysSiteMapper.insertList(pojos);
    }

    public List<SysSite> select(SysSite pojo){
        return sysSiteMapper.select(pojo);
    }

    public int update(SysSite pojo){
        return sysSiteMapper.update(pojo);
    }

}

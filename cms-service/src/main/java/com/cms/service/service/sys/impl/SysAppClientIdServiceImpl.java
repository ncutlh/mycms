package com.cms.service.service.sys.impl;

import com.cms.pojo.sys.SysAppClientId;
import com.cms.service.mapper.sys.SysAppClientIdMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SysAppClientIdServiceImpl {

    @Resource
    private SysAppClientIdMapper sysAppClientIdMapper;

    public int insert(SysAppClientId pojo){
        return sysAppClientIdMapper.insert(pojo);
    }

    public int insertList(List< SysAppClientId> pojos){
        return sysAppClientIdMapper.insertList(pojos);
    }

    public List<SysAppClientId> select(SysAppClientId pojo){
        return sysAppClientIdMapper.select(pojo);
    }

    public int update(SysAppClientId pojo){
        return sysAppClientIdMapper.update(pojo);
    }

}

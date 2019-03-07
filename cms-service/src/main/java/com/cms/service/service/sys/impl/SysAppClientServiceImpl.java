package com.cms.service.service.sys.impl;



import com.cms.pojo.sys.SysAppClient;
import com.cms.service.mapper.sys.SysAppClientMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysAppClientServiceImpl {

    @Resource
    private SysAppClientMapper sysAppClientMapper;

    public int insert(SysAppClient pojo){
        return sysAppClientMapper.insert(pojo);
    }

    public int insertList(List< SysAppClient> pojos){
        return sysAppClientMapper.insertList(pojos);
    }

    public List<SysAppClient> select(SysAppClient pojo){
        return sysAppClientMapper.select(pojo);
    }

    public int update(SysAppClient pojo){
        return sysAppClientMapper.update(pojo);
    }

}

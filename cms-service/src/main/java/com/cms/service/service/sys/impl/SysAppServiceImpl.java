package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysApp;
import com.cms.service.mapper.sys.SysAppMapper;

@Service
public class SysAppServiceImpl {

    @Resource
    private SysAppMapper sysAppMapper;

    public int insert(SysApp pojo){
        return sysAppMapper.insert(pojo);
    }

    public int insertList(List< SysApp> pojos){
        return sysAppMapper.insertList(pojos);
    }

    public List<SysApp> select(SysApp pojo){
        return sysAppMapper.select(pojo);
    }

    public int update(SysApp pojo){
        return sysAppMapper.update(pojo);
    }

}

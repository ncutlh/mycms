package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysConfigData;
import com.cms.service.mapper.sys.SysConfigDataMapper;

@Service
public class SysConfigDataServiceImpl {

    @Resource
    private SysConfigDataMapper sysConfigDataMapper;

    public int insert(SysConfigData pojo){
        return sysConfigDataMapper.insert(pojo);
    }

    public int insertList(List< SysConfigData> pojos){
        return sysConfigDataMapper.insertList(pojos);
    }

    public List<SysConfigData> select(SysConfigData pojo){
        return sysConfigDataMapper.select(pojo);
    }

    public int update(SysConfigData pojo){
        return sysConfigDataMapper.update(pojo);
    }

}

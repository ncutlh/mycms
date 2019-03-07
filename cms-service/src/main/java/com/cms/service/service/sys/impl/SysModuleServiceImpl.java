package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysModule;
import com.cms.service.mapper.sys.SysModuleMapper;

@Service
public class SysModuleServiceImpl {

    @Resource
    private SysModuleMapper sysModuleMapper;

    public int insert(SysModule pojo){
        return sysModuleMapper.insert(pojo);
    }

    public int insertList(List< SysModule> pojos){
        return sysModuleMapper.insertList(pojos);
    }

    public List<SysModule> select(SysModule pojo){
        return sysModuleMapper.select(pojo);
    }

    public int update(SysModule pojo){
        return sysModuleMapper.update(pojo);
    }

}

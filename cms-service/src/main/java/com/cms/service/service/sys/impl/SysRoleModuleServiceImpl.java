package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRoleModule;
import com.cms.service.mapper.sys.SysRoleModuleMapper;

@Service
public class SysRoleModuleServiceImpl {

    @Resource
    private SysRoleModuleMapper sysRoleModuleMapper;

    public int insert(SysRoleModule pojo){
        return sysRoleModuleMapper.insert(pojo);
    }

    public int insertList(List< SysRoleModule> pojos){
        return sysRoleModuleMapper.insertList(pojos);
    }

    public List<SysRoleModule> select(SysRoleModule pojo){
        return sysRoleModuleMapper.select(pojo);
    }

    public int update(SysRoleModule pojo){
        return sysRoleModuleMapper.update(pojo);
    }

}

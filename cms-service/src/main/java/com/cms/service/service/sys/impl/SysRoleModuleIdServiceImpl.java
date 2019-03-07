package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRoleModuleId;
import com.cms.service.mapper.sys.SysRoleModuleIdMapper;

@Service
public class SysRoleModuleIdServiceImpl {

    @Resource
    private SysRoleModuleIdMapper sysRoleModuleIdMapper;

    public int insert(SysRoleModuleId pojo){
        return sysRoleModuleIdMapper.insert(pojo);
    }

    public int insertList(List< SysRoleModuleId> pojos){
        return sysRoleModuleIdMapper.insertList(pojos);
    }

    public List<SysRoleModuleId> select(SysRoleModuleId pojo){
        return sysRoleModuleIdMapper.select(pojo);
    }

    public int update(SysRoleModuleId pojo){
        return sysRoleModuleIdMapper.update(pojo);
    }

}

package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRoleUserId;
import com.cms.service.mapper.sys.SysRoleUserIdMapper;

@Service
public class SysRoleUserIdServiceImpl {

    @Resource
    private SysRoleUserIdMapper sysRoleUserIdMapper;

    public int insert(SysRoleUserId pojo){
        return sysRoleUserIdMapper.insert(pojo);
    }

    public int insertList(List< SysRoleUserId> pojos){
        return sysRoleUserIdMapper.insertList(pojos);
    }

    public List<SysRoleUserId> select(SysRoleUserId pojo){
        return sysRoleUserIdMapper.select(pojo);
    }

    public int update(SysRoleUserId pojo){
        return sysRoleUserIdMapper.update(pojo);
    }

}

package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRoleAuthorizedId;
import com.cms.service.mapper.sys.SysRoleAuthorizedIdMapper;

@Service
public class SysRoleAuthorizedIdServiceImpl {

    @Resource
    private SysRoleAuthorizedIdMapper sysRoleAuthorizedIdMapper;

    public int insert(SysRoleAuthorizedId pojo){
        return sysRoleAuthorizedIdMapper.insert(pojo);
    }

    public int insertList(List< SysRoleAuthorizedId> pojos){
        return sysRoleAuthorizedIdMapper.insertList(pojos);
    }

    public List<SysRoleAuthorizedId> select(SysRoleAuthorizedId pojo){
        return sysRoleAuthorizedIdMapper.select(pojo);
    }

    public int update(SysRoleAuthorizedId pojo){
        return sysRoleAuthorizedIdMapper.update(pojo);
    }

}

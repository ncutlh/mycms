package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRole;
import com.cms.service.mapper.sys.SysRoleMapper;

@Service
public class SysRoleServiceImpl {

    @Resource
    private SysRoleMapper sysRoleMapper;

    public int insert(SysRole pojo){
        return sysRoleMapper.insert(pojo);
    }

    public int insertList(List< SysRole> pojos){
        return sysRoleMapper.insertList(pojos);
    }

    public List<SysRole> select(SysRole pojo){
        return sysRoleMapper.select(pojo);
    }

    public int update(SysRole pojo){
        return sysRoleMapper.update(pojo);
    }

}

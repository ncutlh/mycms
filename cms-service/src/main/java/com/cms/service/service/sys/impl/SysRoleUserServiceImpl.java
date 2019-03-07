package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRoleUser;
import com.cms.service.mapper.sys.SysRoleUserMapper;

@Service
public class SysRoleUserServiceImpl {

    @Resource
    private SysRoleUserMapper sysRoleUserMapper;

    public int insert(SysRoleUser pojo){
        return sysRoleUserMapper.insert(pojo);
    }

    public int insertList(List< SysRoleUser> pojos){
        return sysRoleUserMapper.insertList(pojos);
    }

    public List<SysRoleUser> select(SysRoleUser pojo){
        return sysRoleUserMapper.select(pojo);
    }

    public int update(SysRoleUser pojo){
        return sysRoleUserMapper.update(pojo);
    }

}

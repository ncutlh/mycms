package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysUser;
import com.cms.service.mapper.sys.SysUserMapper;

@Service
public class SysUserServiceImpl {

    @Resource
    private SysUserMapper sysUserMapper;

    public int insert(SysUser pojo){
        return sysUserMapper.insert(pojo);
    }

    public int insertList(List< SysUser> pojos){
        return sysUserMapper.insertList(pojos);
    }

    public List<SysUser> select(SysUser pojo){
        return sysUserMapper.select(pojo);
    }

    public int update(SysUser pojo){
        return sysUserMapper.update(pojo);
    }

}

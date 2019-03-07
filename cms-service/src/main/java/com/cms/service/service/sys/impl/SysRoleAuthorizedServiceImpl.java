package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysRoleAuthorized;
import com.cms.service.mapper.sys.SysRoleAuthorizedMapper;

@Service
public class SysRoleAuthorizedServiceImpl {

    @Resource
    private SysRoleAuthorizedMapper sysRoleAuthorizedMapper;

    public int insert(SysRoleAuthorized pojo){
        return sysRoleAuthorizedMapper.insert(pojo);
    }

    public int insertList(List< SysRoleAuthorized> pojos){
        return sysRoleAuthorizedMapper.insertList(pojos);
    }

    public List<SysRoleAuthorized> select(SysRoleAuthorized pojo){
        return sysRoleAuthorizedMapper.select(pojo);
    }

    public int update(SysRoleAuthorized pojo){
        return sysRoleAuthorizedMapper.update(pojo);
    }

}

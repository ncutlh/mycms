package com.cms.service.service.sys;

import com.cms.pojo.sys.SysRole;

import java.util.List;
public interface  SysRoleService {


    int insert(SysRole pojo);

    int insertList(List< SysRole> pojos);

    List<SysRole> select(SysRole pojo);

    int update(SysRole pojo);

}

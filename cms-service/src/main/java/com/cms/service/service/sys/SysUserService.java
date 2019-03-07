package com.cms.service.service.sys;



import com.cms.pojo.sys.SysUser;

import java.util.List;
public interface  SysUserService {

    int insert(SysUser pojo);

    int insertList(List< SysUser> pojos);

    List<SysUser> select(SysUser pojo);

    int update(SysUser pojo);

}

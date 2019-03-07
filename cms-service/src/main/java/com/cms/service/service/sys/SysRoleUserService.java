package com.cms.service.service.sys;



import com.cms.pojo.sys.SysRoleUser;

import java.util.List;
public interface SysRoleUserService {

     int insert(SysRoleUser pojo);

     int insertList(List< SysRoleUser> pojos);

     List<SysRoleUser> select(SysRoleUser pojo);

     int update(SysRoleUser pojo);

}

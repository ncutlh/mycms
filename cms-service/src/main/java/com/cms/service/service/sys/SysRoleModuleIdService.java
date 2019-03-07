package com.cms.service.service.sys;


import com.cms.pojo.sys.SysRoleModuleId;

import java.util.List;
public interface  SysRoleModuleIdService {


   int insert(SysRoleModuleId pojo);

   int insertList(List< SysRoleModuleId> pojos);

   List<SysRoleModuleId> select(SysRoleModuleId pojo);

   int update(SysRoleModuleId pojo);

}

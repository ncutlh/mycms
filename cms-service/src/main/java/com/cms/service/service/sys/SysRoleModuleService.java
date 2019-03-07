package com.cms.service.service.sys;



import com.cms.pojo.sys.SysRoleModule;

import java.util.List;
public interface SysRoleModuleService {


    int insert(SysRoleModule pojo);

    int insertList(List< SysRoleModule> pojos);

    List<SysRoleModule> select(SysRoleModule pojo);

    int update(SysRoleModule pojo);

}

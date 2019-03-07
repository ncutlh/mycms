package com.cms.service.service.sys;



import com.cms.pojo.sys.SysRoleAuthorized;

import java.util.List;
public interface SysRoleAuthorizedService {

    int insert(SysRoleAuthorized pojo);

    int insertList(List< SysRoleAuthorized> pojos);

    List<SysRoleAuthorized> select(SysRoleAuthorized pojo);

    int update(SysRoleAuthorized pojo);

}

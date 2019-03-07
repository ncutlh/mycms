package com.cms.service.service.sys;



import com.cms.pojo.sys.SysRoleAuthorizedId;

import java.util.List;
public interface SysRoleAuthorizedIdService {


    int insert(SysRoleAuthorizedId pojo);

    int insertList(List< SysRoleAuthorizedId> pojos);

    List<SysRoleAuthorizedId> select(SysRoleAuthorizedId pojo);

    int update(SysRoleAuthorizedId pojo);

}

package com.cms.service.service.sys;



import com.cms.pojo.sys.SysRoleUserId;

import java.util.List;
public interface  SysRoleUserIdService {



    int insert(SysRoleUserId pojo);

    int insertList(List< SysRoleUserId> pojos);

    List<SysRoleUserId> select(SysRoleUserId pojo);

    int update(SysRoleUserId pojo);

}

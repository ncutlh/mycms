package com.cms.service.service.sys;



import com.cms.pojo.sys.SysUserToken;

import java.util.List;
public interface SysUserTokenService {


    int insert(SysUserToken pojo);

    int insertList(List< SysUserToken> pojos);
    List<SysUserToken> select(SysUserToken pojo);

    int update(SysUserToken pojo);

}

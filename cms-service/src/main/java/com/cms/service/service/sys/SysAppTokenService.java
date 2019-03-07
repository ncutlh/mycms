package com.cms.service.service.sys;


import com.cms.pojo.sys.SysAppToken;

import java.util.List;

public interface SysAppTokenService {



    int insert(SysAppToken pojo);

    int insertList(List< SysAppToken> pojos);

    List<SysAppToken> select(SysAppToken pojo);

    int update(SysAppToken pojo);

}

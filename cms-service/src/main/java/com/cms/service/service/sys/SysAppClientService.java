package com.cms.service.service.sys;


import com.cms.pojo.sys.SysAppClient;

import java.util.List;

public interface SysAppClientService {

   
    int insert(SysAppClient pojo);

    int insertList(List< SysAppClient> pojos);
    List<SysAppClient> select(SysAppClient pojo);
    int update(SysAppClient pojo);
}

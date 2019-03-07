package com.cms.service.service.sys;


import com.cms.pojo.sys.SysApp;

import java.util.List;

public interface  SysAppService {


    int insert(SysApp pojo);

    int insertList(List< SysApp> pojos);

    List<SysApp> select(SysApp pojo);

    int update(SysApp pojo);

}

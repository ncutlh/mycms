package com.cms.service.service.sys;

import com.cms.pojo.sys.SysAppClientId;

import java.util.List;

public interface SysAppClientIdService {

     int insert(SysAppClientId pojo);

     int insertList(List< SysAppClientId> pojos);

     List<SysAppClientId> select(SysAppClientId pojo);

     int update(SysAppClientId pojo);

}

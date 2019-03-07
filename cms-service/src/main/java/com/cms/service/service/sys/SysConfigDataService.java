package com.cms.service.service.sys;



import com.cms.pojo.sys.SysConfigData;

import java.util.List;

public interface SysConfigDataService {


     int insert(SysConfigData pojo);

     int insertList(List< SysConfigData> pojos);

     List<SysConfigData> select(SysConfigData pojo);

     int update(SysConfigData pojo);

}

package com.cms.service.service.sys;



import com.cms.pojo.sys.SysModule;

import java.util.List;
public interface  SysModuleService {


    int insert(SysModule pojo);

    int insertList(List< SysModule> pojos);

    List<SysModule> select(SysModule pojo);

    int update(SysModule pojo);

}

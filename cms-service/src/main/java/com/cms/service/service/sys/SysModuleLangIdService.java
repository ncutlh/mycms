package com.cms.service.service.sys;



import com.cms.pojo.sys.SysModuleLangId;

import java.util.List;
public interface SysModuleLangIdService {



    int insert(SysModuleLangId pojo);

    int insertList(List< SysModuleLangId> pojos);

    List<SysModuleLangId> select(SysModuleLangId pojo);

    int update(SysModuleLangId pojo);

}

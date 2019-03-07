package com.cms.service.service.sys;



import com.cms.pojo.sys.SysModuleLang;

import java.util.List;
public interface SysModuleLangService {


    int insert(SysModuleLang pojo);

    int insertList(List< SysModuleLang> pojos);

    List<SysModuleLang> select(SysModuleLang pojo);

    int update(SysModuleLang pojo);

}

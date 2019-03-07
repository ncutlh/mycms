package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDeptConfig;

import java.util.List;
public interface SysDeptConfigService {

    int insert(SysDeptConfig pojo);

    int insertList(List< SysDeptConfig> pojos);

    List<SysDeptConfig> select(SysDeptConfig pojo);

    int update(SysDeptConfig pojo);

}

package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDomain;

import java.util.List;
public interface SysDomainService {


    int insert(SysDomain pojo);

    int insertList(List< SysDomain> pojos);

    List<SysDomain> select(SysDomain pojo);

    int update(SysDomain pojo);

}

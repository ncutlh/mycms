package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDeptPageId;

import java.util.List;
public interface SysDeptPageIdService {



    int insert(SysDeptPageId pojo);

    int insertList(List< SysDeptPageId> pojos);

    List<SysDeptPageId> select(SysDeptPageId pojo);

    int update(SysDeptPageId pojo);

}

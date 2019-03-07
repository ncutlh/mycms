package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDeptConfigId;

import java.util.List;
public interface  SysDeptConfigIdService {


    int insert(SysDeptConfigId pojo);

    int insertList(List< SysDeptConfigId> pojos);

    List<SysDeptConfigId> select(SysDeptConfigId pojo);

    int update(SysDeptConfigId pojo);

}

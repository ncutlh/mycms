package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDept;

import java.util.List;
public interface SysDeptService {


    int insert(SysDept pojo);

    int insertList(List< SysDept> pojos);

    List<SysDept> select(SysDept pojo);

    int update(SysDept pojo);

}

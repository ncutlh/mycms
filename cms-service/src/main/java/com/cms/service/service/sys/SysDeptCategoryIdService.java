package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDeptCategoryId;

import java.util.List;

public interface  SysDeptCategoryIdService {


    int insert(SysDeptCategoryId pojo);

    int insertList(List< SysDeptCategoryId> pojos);

    List<SysDeptCategoryId> select(SysDeptCategoryId pojo);

    int update(SysDeptCategoryId pojo);

}

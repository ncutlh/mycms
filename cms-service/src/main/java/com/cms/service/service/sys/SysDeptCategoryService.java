package com.cms.service.service.sys;


import com.cms.pojo.sys.SysDeptCategory;

import java.util.List;

public interface  SysDeptCategoryService {



     int insert(SysDeptCategory pojo);

     int insertList(List< SysDeptCategory> pojos);

     List<SysDeptCategory> select(SysDeptCategory pojo);

     int update(SysDeptCategory pojo);

}

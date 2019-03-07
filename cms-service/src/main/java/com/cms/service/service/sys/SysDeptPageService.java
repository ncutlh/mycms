package com.cms.service.service.sys;



import com.cms.pojo.sys.SysDeptPage;

import java.util.List;
public interface SysDeptPageService {


   int insert(SysDeptPage pojo);

   int insertList(List< SysDeptPage> pojos);

   List<SysDeptPage> select(SysDeptPage pojo);

   int update(SysDeptPage pojo);

}

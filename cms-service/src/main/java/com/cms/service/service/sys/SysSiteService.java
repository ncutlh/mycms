package com.cms.service.service.sys;


import java.util.List;
import com.cms.pojo.sys.SysSite;
public interface  SysSiteService {


     int insert(SysSite pojo);

     int insertList(List< SysSite> pojos);

     List<SysSite> select(SysSite pojo);

     int update(SysSite pojo);

}

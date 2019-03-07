package com.cms.service.service.sys;


import com.cms.pojo.sys.SysCluster;

import java.util.List;

public interface SysClusterService {


     int insert(SysCluster pojo);

     int insertList(List< SysCluster> pojos);

     List<SysCluster> select(SysCluster pojo);

     int update(SysCluster pojo);

}

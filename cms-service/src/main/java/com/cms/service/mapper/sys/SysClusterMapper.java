package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysCluster;

public interface SysClusterMapper {

    int insert(@Param("pojo") SysCluster pojo);

    int insertList(@Param("pojos") List<SysCluster> pojo);

    List<SysCluster> select(@Param("pojo") SysCluster pojo);

    int update(@Param("pojo") SysCluster pojo);

}

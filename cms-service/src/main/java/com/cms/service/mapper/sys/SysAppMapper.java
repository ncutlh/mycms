package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysApp;

public interface SysAppMapper {

    int insert(@Param("pojo") SysApp pojo);

    int insertList(@Param("pojos") List<SysApp> pojo);

    List<SysApp> select(@Param("pojo") SysApp pojo);

    int update(@Param("pojo") SysApp pojo);

}

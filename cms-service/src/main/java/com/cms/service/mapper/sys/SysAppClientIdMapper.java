package com.cms.service.mapper.sys;



import com.cms.pojo.sys.SysAppClientId;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysAppClientIdMapper {

    int insert(@Param("pojo") SysAppClientId pojo);

    int insertList(@Param("pojos") List<SysAppClientId> pojo);

    List<SysAppClientId> select(@Param("pojo") SysAppClientId pojo);

    int update(@Param("pojo") SysAppClientId pojo);

}

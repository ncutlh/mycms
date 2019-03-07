package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysAppClient;

public interface SysAppClientMapper {

    int insert(@Param("pojo") SysAppClient pojo);

    int insertList(@Param("pojos") List<SysAppClient> pojo);

    List<SysAppClient> select(@Param("pojo") SysAppClient pojo);

    int update(@Param("pojo") SysAppClient pojo);

}

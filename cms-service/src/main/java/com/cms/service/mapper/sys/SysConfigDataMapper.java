package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysConfigData;

public interface SysConfigDataMapper {

    int insert(@Param("pojo") SysConfigData pojo);

    int insertList(@Param("pojos") List<SysConfigData> pojo);

    List<SysConfigData> select(@Param("pojo") SysConfigData pojo);

    int update(@Param("pojo") SysConfigData pojo);

}

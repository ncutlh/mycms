package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysConfigDataId;

public interface SysConfigDataIdMapper {

    int insert(@Param("pojo") SysConfigDataId pojo);

    int insertList(@Param("pojos") List<SysConfigDataId> pojo);

    List<SysConfigDataId> select(@Param("pojo") SysConfigDataId pojo);

    int update(@Param("pojo") SysConfigDataId pojo);

}

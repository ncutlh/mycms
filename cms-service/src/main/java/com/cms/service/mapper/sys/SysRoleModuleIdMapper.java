package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRoleModuleId;

public interface SysRoleModuleIdMapper {

    int insert(@Param("pojo") SysRoleModuleId pojo);

    int insertList(@Param("pojos") List<SysRoleModuleId> pojo);

    List<SysRoleModuleId> select(@Param("pojo") SysRoleModuleId pojo);

    int update(@Param("pojo") SysRoleModuleId pojo);

}

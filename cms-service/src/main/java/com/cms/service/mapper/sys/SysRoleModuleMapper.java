package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRoleModule;

public interface SysRoleModuleMapper {

    int insert(@Param("pojo") SysRoleModule pojo);

    int insertList(@Param("pojos") List<SysRoleModule> pojo);

    List<SysRoleModule> select(@Param("pojo") SysRoleModule pojo);

    int update(@Param("pojo") SysRoleModule pojo);

}

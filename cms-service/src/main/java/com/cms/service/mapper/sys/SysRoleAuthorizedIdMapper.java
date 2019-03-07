package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRoleAuthorizedId;

public interface SysRoleAuthorizedIdMapper {

    int insert(@Param("pojo") SysRoleAuthorizedId pojo);

    int insertList(@Param("pojos") List<SysRoleAuthorizedId> pojo);

    List<SysRoleAuthorizedId> select(@Param("pojo") SysRoleAuthorizedId pojo);

    int update(@Param("pojo") SysRoleAuthorizedId pojo);

}

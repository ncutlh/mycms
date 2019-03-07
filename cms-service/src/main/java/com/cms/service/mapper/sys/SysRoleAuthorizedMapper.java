package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRoleAuthorized;

public interface SysRoleAuthorizedMapper {

    int insert(@Param("pojo") SysRoleAuthorized pojo);

    int insertList(@Param("pojos") List<SysRoleAuthorized> pojo);

    List<SysRoleAuthorized> select(@Param("pojo") SysRoleAuthorized pojo);

    int update(@Param("pojo") SysRoleAuthorized pojo);

}

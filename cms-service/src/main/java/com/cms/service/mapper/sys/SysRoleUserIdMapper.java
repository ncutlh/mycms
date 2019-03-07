package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRoleUserId;

public interface SysRoleUserIdMapper {

    int insert(@Param("pojo") SysRoleUserId pojo);

    int insertList(@Param("pojos") List<SysRoleUserId> pojo);

    List<SysRoleUserId> select(@Param("pojo") SysRoleUserId pojo);

    int update(@Param("pojo") SysRoleUserId pojo);

}

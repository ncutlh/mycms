package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRoleUser;

public interface SysRoleUserMapper {

    int insert(@Param("pojo") SysRoleUser pojo);

    int insertList(@Param("pojos") List<SysRoleUser> pojo);

    List<SysRoleUser> select(@Param("pojo") SysRoleUser pojo);

    int update(@Param("pojo") SysRoleUser pojo);

}

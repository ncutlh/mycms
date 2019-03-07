package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysRole;

public interface SysRoleMapper {

    int insert(@Param("pojo") SysRole pojo);

    int insertList(@Param("pojos") List<SysRole> pojo);

    List<SysRole> select(@Param("pojo") SysRole pojo);

    int update(@Param("pojo") SysRole pojo);

}

package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysUser;

public interface SysUserMapper {

    int insert(@Param("pojo") SysUser pojo);

    int insertList(@Param("pojos") List<SysUser> pojo);

    List<SysUser> select(@Param("pojo") SysUser pojo);

    int update(@Param("pojo") SysUser pojo);

}

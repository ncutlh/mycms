package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysUserToken;

public interface SysUserTokenMapper {

    int insert(@Param("pojo") SysUserToken pojo);

    int insertList(@Param("pojos") List<SysUserToken> pojo);

    List<SysUserToken> select(@Param("pojo") SysUserToken pojo);

    int update(@Param("pojo") SysUserToken pojo);

}

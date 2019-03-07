package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysAppToken;

public interface SysAppTokenMapper {

    int insert(@Param("pojo") SysAppToken pojo);

    int insertList(@Param("pojos") List<SysAppToken> pojo);

    List<SysAppToken> select(@Param("pojo") SysAppToken pojo);

    int update(@Param("pojo") SysAppToken pojo);

}

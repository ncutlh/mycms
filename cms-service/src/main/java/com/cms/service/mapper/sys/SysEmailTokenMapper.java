package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysEmailToken;

public interface SysEmailTokenMapper {

    int insert(@Param("pojo") SysEmailToken pojo);

    int insertList(@Param("pojos") List<SysEmailToken> pojo);

    List<SysEmailToken> select(@Param("pojo") SysEmailToken pojo);

    int update(@Param("pojo") SysEmailToken pojo);

}

package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysModule;

public interface SysModuleMapper {

    int insert(@Param("pojo") SysModule pojo);

    int insertList(@Param("pojos") List<SysModule> pojo);

    List<SysModule> select(@Param("pojo") SysModule pojo);

    int update(@Param("pojo") SysModule pojo);

}

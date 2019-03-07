package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysModuleLangId;

public interface SysModuleLangIdMapper {

    int insert(@Param("pojo") SysModuleLangId pojo);

    int insertList(@Param("pojos") List<SysModuleLangId> pojo);

    List<SysModuleLangId> select(@Param("pojo") SysModuleLangId pojo);

    int update(@Param("pojo") SysModuleLangId pojo);

}

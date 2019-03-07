package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysModuleLang;

public interface SysModuleLangMapper {

    int insert(@Param("pojo") SysModuleLang pojo);

    int insertList(@Param("pojos") List<SysModuleLang> pojo);

    List<SysModuleLang> select(@Param("pojo") SysModuleLang pojo);

    int update(@Param("pojo") SysModuleLang pojo);

}

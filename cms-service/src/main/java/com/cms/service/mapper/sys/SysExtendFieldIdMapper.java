package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysExtendFieldId;

public interface SysExtendFieldIdMapper {

    int insert(@Param("pojo") SysExtendFieldId pojo);

    int insertList(@Param("pojos") List<SysExtendFieldId> pojo);

    List<SysExtendFieldId> select(@Param("pojo") SysExtendFieldId pojo);

    int update(@Param("pojo") SysExtendFieldId pojo);

}

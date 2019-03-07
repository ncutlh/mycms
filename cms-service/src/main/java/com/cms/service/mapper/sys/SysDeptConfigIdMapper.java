package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDeptConfigId;

public interface SysDeptConfigIdMapper {

    int insert(@Param("pojo") SysDeptConfigId pojo);

    int insertList(@Param("pojos") List<SysDeptConfigId> pojo);

    List<SysDeptConfigId> select(@Param("pojo") SysDeptConfigId pojo);

    int update(@Param("pojo") SysDeptConfigId pojo);

}

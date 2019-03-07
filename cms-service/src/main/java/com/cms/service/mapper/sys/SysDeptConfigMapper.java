package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDeptConfig;

public interface SysDeptConfigMapper {

    int insert(@Param("pojo") SysDeptConfig pojo);

    int insertList(@Param("pojos") List<SysDeptConfig> pojo);

    List<SysDeptConfig> select(@Param("pojo") SysDeptConfig pojo);

    int update(@Param("pojo") SysDeptConfig pojo);

}

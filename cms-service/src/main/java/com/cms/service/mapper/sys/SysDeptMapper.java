package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDept;

public interface SysDeptMapper {

    int insert(@Param("pojo") SysDept pojo);

    int insertList(@Param("pojos") List<SysDept> pojo);

    List<SysDept> select(@Param("pojo") SysDept pojo);

    int update(@Param("pojo") SysDept pojo);

}

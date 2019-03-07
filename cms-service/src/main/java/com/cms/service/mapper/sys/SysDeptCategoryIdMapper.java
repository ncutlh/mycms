package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDeptCategoryId;

public interface SysDeptCategoryIdMapper {

    int insert(@Param("pojo") SysDeptCategoryId pojo);

    int insertList(@Param("pojos") List<SysDeptCategoryId> pojo);

    List<SysDeptCategoryId> select(@Param("pojo") SysDeptCategoryId pojo);

    int update(@Param("pojo") SysDeptCategoryId pojo);

}

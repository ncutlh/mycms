package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDeptCategory;

public interface SysDeptCategoryMapper {

    int insert(@Param("pojo") SysDeptCategory pojo);

    int insertList(@Param("pojos") List<SysDeptCategory> pojo);

    List<SysDeptCategory> select(@Param("pojo") SysDeptCategory pojo);

    int update(@Param("pojo") SysDeptCategory pojo);

}

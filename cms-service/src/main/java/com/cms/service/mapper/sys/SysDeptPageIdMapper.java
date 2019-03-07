package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDeptPageId;

public interface SysDeptPageIdMapper {

    int insert(@Param("pojo") SysDeptPageId pojo);

    int insertList(@Param("pojos") List<SysDeptPageId> pojo);

    List<SysDeptPageId> select(@Param("pojo") SysDeptPageId pojo);

    int update(@Param("pojo") SysDeptPageId pojo);

}

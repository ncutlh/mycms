package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDeptPage;

public interface SysDeptPageMapper {

    int insert(@Param("pojo") SysDeptPage pojo);

    int insertList(@Param("pojos") List<SysDeptPage> pojo);

    List<SysDeptPage> select(@Param("pojo") SysDeptPage pojo);

    int update(@Param("pojo") SysDeptPage pojo);

}

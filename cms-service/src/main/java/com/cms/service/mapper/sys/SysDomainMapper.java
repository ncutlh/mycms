package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysDomain;

public interface SysDomainMapper {

    int insert(@Param("pojo") SysDomain pojo);

    int insertList(@Param("pojos") List<SysDomain> pojo);

    List<SysDomain> select(@Param("pojo") SysDomain pojo);

    int update(@Param("pojo") SysDomain pojo);

}

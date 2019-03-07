package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysSite;

public interface SysSiteMapper {

    int insert(@Param("pojo") SysSite pojo);

    int insertList(@Param("pojos") List<SysSite> pojo);

    List<SysSite> select(@Param("pojo") SysSite pojo);

    int update(@Param("pojo") SysSite pojo);

}

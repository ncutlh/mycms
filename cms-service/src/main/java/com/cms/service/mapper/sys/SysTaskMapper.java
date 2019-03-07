package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysTask;

public interface SysTaskMapper {

    int insert(@Param("pojo") SysTask pojo);

    int insertList(@Param("pojos") List<SysTask> pojo);

    List<SysTask> select(@Param("pojo") SysTask pojo);

    int update(@Param("pojo") SysTask pojo);

}

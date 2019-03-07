package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysExtend;

public interface SysExtendMapper {

    int insert(@Param("pojo") SysExtend pojo);

    int insertList(@Param("pojos") List<SysExtend> pojo);

    List<SysExtend> select(@Param("pojo") SysExtend pojo);

    int update(@Param("pojo") SysExtend pojo);

}

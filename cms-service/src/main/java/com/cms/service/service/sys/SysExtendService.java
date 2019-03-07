package com.cms.service.service.sys;



import com.cms.pojo.sys.SysExtend;

import java.util.List;
public interface SysExtendService {


    int insert(SysExtend pojo);

    int insertList(List< SysExtend> pojos);

    List<SysExtend> select(SysExtend pojo);

    int update(SysExtend pojo);

}

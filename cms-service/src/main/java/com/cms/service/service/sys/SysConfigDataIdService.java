package com.cms.service.service.sys;



import com.cms.pojo.sys.SysConfigDataId;

import java.util.List;

public interface SysConfigDataIdService {


    int insert(SysConfigDataId pojo);

    int insertList(List< SysConfigDataId> pojos);

    List<SysConfigDataId> select(SysConfigDataId pojo);

    int update(SysConfigDataId pojo);

}

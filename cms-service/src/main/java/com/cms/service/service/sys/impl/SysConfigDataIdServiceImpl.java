package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysConfigDataId;
import com.cms.service.mapper.sys.SysConfigDataIdMapper;

@Service
public class SysConfigDataIdServiceImpl {

    @Resource
    private SysConfigDataIdMapper sysConfigDataIdMapper;

    public int insert(SysConfigDataId pojo){
        return sysConfigDataIdMapper.insert(pojo);
    }

    public int insertList(List< SysConfigDataId> pojos){
        return sysConfigDataIdMapper.insertList(pojos);
    }

    public List<SysConfigDataId> select(SysConfigDataId pojo){
        return sysConfigDataIdMapper.select(pojo);
    }

    public int update(SysConfigDataId pojo){
        return sysConfigDataIdMapper.update(pojo);
    }

}

package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysExtendFieldId;
import com.cms.service.mapper.sys.SysExtendFieldIdMapper;

@Service
public class SysExtendFieldIdServiceImpl {

    @Resource
    private SysExtendFieldIdMapper sysExtendFieldIdMapper;

    public int insert(SysExtendFieldId pojo){
        return sysExtendFieldIdMapper.insert(pojo);
    }

    public int insertList(List< SysExtendFieldId> pojos){
        return sysExtendFieldIdMapper.insertList(pojos);
    }

    public List<SysExtendFieldId> select(SysExtendFieldId pojo){
        return sysExtendFieldIdMapper.select(pojo);
    }

    public int update(SysExtendFieldId pojo){
        return sysExtendFieldIdMapper.update(pojo);
    }

}

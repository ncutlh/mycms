package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysModuleLangId;
import com.cms.service.mapper.sys.SysModuleLangIdMapper;

@Service
public class SysModuleLangIdServiceImpl {

    @Resource
    private SysModuleLangIdMapper sysModuleLangIdMapper;

    public int insert(SysModuleLangId pojo){
        return sysModuleLangIdMapper.insert(pojo);
    }

    public int insertList(List< SysModuleLangId> pojos){
        return sysModuleLangIdMapper.insertList(pojos);
    }

    public List<SysModuleLangId> select(SysModuleLangId pojo){
        return sysModuleLangIdMapper.select(pojo);
    }

    public int update(SysModuleLangId pojo){
        return sysModuleLangIdMapper.update(pojo);
    }

}

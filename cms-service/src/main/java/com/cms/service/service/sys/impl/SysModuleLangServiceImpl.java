package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysModuleLang;
import com.cms.service.mapper.sys.SysModuleLangMapper;

@Service
public class SysModuleLangServiceImpl {

    @Resource
    private SysModuleLangMapper sysModuleLangMapper;

    public int insert(SysModuleLang pojo){
        return sysModuleLangMapper.insert(pojo);
    }

    public int insertList(List< SysModuleLang> pojos){
        return sysModuleLangMapper.insertList(pojos);
    }

    public List<SysModuleLang> select(SysModuleLang pojo){
        return sysModuleLangMapper.select(pojo);
    }

    public int update(SysModuleLang pojo){
        return sysModuleLangMapper.update(pojo);
    }

}

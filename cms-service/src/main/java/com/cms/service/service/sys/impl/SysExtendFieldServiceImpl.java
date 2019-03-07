package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysExtendField;
import com.cms.service.mapper.sys.SysExtendFieldMapper;

@Service
public class SysExtendFieldServiceImpl {

    @Resource
    private SysExtendFieldMapper sysExtendFieldMapper;

    public int insert(SysExtendField pojo){
        return sysExtendFieldMapper.insert(pojo);
    }

    public int insertList(List< SysExtendField> pojos){
        return sysExtendFieldMapper.insertList(pojos);
    }

    public List<SysExtendField> select(SysExtendField pojo){
        return sysExtendFieldMapper.select(pojo);
    }

    public int update(SysExtendField pojo){
        return sysExtendFieldMapper.update(pojo);
    }

}

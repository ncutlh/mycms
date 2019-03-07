package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysDeptPage;
import com.cms.service.mapper.sys.SysDeptPageMapper;

@Service
public class SysDeptPageServiceImpl {

    @Resource
    private SysDeptPageMapper sysDeptPageMapper;

    public int insert(SysDeptPage pojo){
        return sysDeptPageMapper.insert(pojo);
    }

    public int insertList(List< SysDeptPage> pojos){
        return sysDeptPageMapper.insertList(pojos);
    }

    public List<SysDeptPage> select(SysDeptPage pojo){
        return sysDeptPageMapper.select(pojo);
    }

    public int update(SysDeptPage pojo){
        return sysDeptPageMapper.update(pojo);
    }

}

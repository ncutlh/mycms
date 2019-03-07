package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsDictionary;
import com.cms.service.mapper.cms.CmsDictionaryMapper;

@Service
public class CmsDictionaryServiceImpl {

    @Resource
    private CmsDictionaryMapper cmsDictionaryMapper;

    public int insert(CmsDictionary pojo){
        return cmsDictionaryMapper.insert(pojo);
    }

    public int insertList(List< CmsDictionary> pojos){
        return cmsDictionaryMapper.insertList(pojos);
    }

    public List<CmsDictionary> select(CmsDictionary pojo){
        return cmsDictionaryMapper.select(pojo);
    }

    public int update(CmsDictionary pojo){
        return cmsDictionaryMapper.update(pojo);
    }

}

package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsDictionaryDataId;
import com.cms.service.mapper.cms.CmsDictionaryDataIdMapper;

@Service
public class CmsDictionaryDataIdServiceImpl {

    @Resource
    private CmsDictionaryDataIdMapper cmsDictionaryDataIdMapper;

    public int insert(CmsDictionaryDataId pojo){
        return cmsDictionaryDataIdMapper.insert(pojo);
    }

    public int insertList(List< CmsDictionaryDataId> pojos){
        return cmsDictionaryDataIdMapper.insertList(pojos);
    }

    public List<CmsDictionaryDataId> select(CmsDictionaryDataId pojo){
        return cmsDictionaryDataIdMapper.select(pojo);
    }

    public int update(CmsDictionaryDataId pojo){
        return cmsDictionaryDataIdMapper.update(pojo);
    }

}

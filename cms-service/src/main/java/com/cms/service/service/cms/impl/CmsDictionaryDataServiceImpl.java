package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsDictionaryData;
import com.cms.service.mapper.cms.CmsDictionaryDataMapper;

@Service
public class CmsDictionaryDataServiceImpl {

    @Resource
    private CmsDictionaryDataMapper cmsDictionaryDataMapper;

    public int insert(CmsDictionaryData pojo){
        return cmsDictionaryDataMapper.insert(pojo);
    }

    public int insertList(List< CmsDictionaryData> pojos){
        return cmsDictionaryDataMapper.insertList(pojos);
    }

    public List<CmsDictionaryData> select(CmsDictionaryData pojo){
        return cmsDictionaryDataMapper.select(pojo);
    }

    public int update(CmsDictionaryData pojo){
        return cmsDictionaryDataMapper.update(pojo);
    }

}

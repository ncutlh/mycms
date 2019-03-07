package com.cms.service.common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 *
 * BaseService
 * 
 * @param <E>
 * 
 */
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private Mapper<T> mapper;//泛型装配

    @Override
    public List<T> list(T entity) {
        return mapper.select(entity);
    }

    @Override
    public T get(T entity) {
        return  mapper.selectOne(entity);
    }

    @Override
    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int update(Integer id, T entity) {

        return 0;
    }


    @Override
    public int save(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int delete(T entity) {
        return mapper.deleteByPrimaryKey(entity);
    }



    @Override
    public T getEntity(Serializable id) {
        return mapper.selectByPrimaryKey(id);
    }
}

package com.cms.service.service.sys;

import com.publiccms.common.base.BaseService;
import com.publiccms.common.handler.PageHandler;
import com.publiccms.entities.sys.SysCluster;
import com.publiccms.logic.dao.sys.SysClusterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;

// Generated 2016-7-16 11:56:50 by com.publiccms.common.source.SourceGenerator

/**
 *
 * SysClusterService
 * 
 */
@Service
@Transactional
public class SysClusterService extends BaseService<SysCluster> {

    /**
     * @param startHeartbeatDate
     * @param endHeartbeatDate
     * @param master
     * @param orderField
     * @param orderType
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Transactional(readOnly = true)
    public PageHandler getPage(Date startHeartbeatDate, Date endHeartbeatDate, Boolean master, String orderField,
            String orderType, Integer pageIndex, Integer pageSize) {
        return dao.getPage(startHeartbeatDate, endHeartbeatDate, master, orderField, orderType, pageIndex, pageSize);
    }

    /**
     * @param id
     * @param date
     */
    public void updateHeartbeatDate(Serializable id, Date date) {
        SysCluster entity = getEntity(id);
        if (null != entity) {
            entity.setHeartbeatDate(date);
        }
    }
    
    /**
     * @param id
     * @param master
     */
    public void updateMaster(Serializable id, boolean master) {
        SysCluster entity = getEntity(id);
        if (null != entity) {
            entity.setMaster(master);
        }
    }

    @Autowired
    private SysClusterDao dao;
    
}
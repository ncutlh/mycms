package com.cms.pojo.sys;
// Generated 2016-7-16 11:17:19 by Hibernate Tools 4.3.1

import lombok.Data;

import java.util.Date;

/**
 * SysCluster generated by hbm2java
 */

//@Table(name = "sys_cluster")
@Data
public class SysCluster implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "ID")
    private String uuid;
   //@GeneratorColumn(title = "启动时间", order = true)
    private Date createDate;
   //@GeneratorColumn(title = "心跳时间", condition = true, order = true)
    private Date heartbeatDate;
   //@GeneratorColumn(title = "管理节点", condition = true)
    private boolean master;
   //@GeneratorColumn(title = "版本", condition = true)
    private String cmsVersion;

    public SysCluster() {
    }

    public SysCluster(String uuid, Date createDate, Date heartbeatDate, boolean master) {
        this.uuid = uuid;
        this.createDate = createDate;
        this.heartbeatDate = heartbeatDate;
        this.master = master;
    }

    public SysCluster(String uuid, Date createDate, Date heartbeatDate, boolean master, String cmsVersion) {
        this.uuid = uuid;
        this.createDate = createDate;
        this.heartbeatDate = heartbeatDate;
        this.master = master;
        this.cmsVersion = cmsVersion;
    }



}
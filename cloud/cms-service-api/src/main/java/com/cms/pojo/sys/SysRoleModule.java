package com.cms.pojo.sys;

import lombok.Data;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

/**
 * SysRoleModule generated by hbm2java
 */

//@Table(name = "sys_role_module")
@Data
public class SysRoleModule implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;

   //@GeneratorColumn(title = "ID")
    private SysRoleModuleId sysRoleModuleId;

    public SysRoleModule() {
    }

    public SysRoleModule(SysRoleModuleId id) {
        this.sysRoleModuleId = id;
    }



}

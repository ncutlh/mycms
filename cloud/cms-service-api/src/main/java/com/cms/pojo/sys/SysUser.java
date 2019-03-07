package com.cms.pojo.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * SysUser generated by hbm2java
 */

//@Table(name = "sys_user", uniqueConstraints = { @UniqueConstraint(columnNames = { "name", "site_id" }),
//        @UniqueConstraint(columnNames = { "nick_name", "site_id" }) })
@Data
public class SysUser implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "ID")
    private Long id;
   //@GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
   //@GeneratorColumn(title = "用户名", condition = true, like = true, or = true, name = "name")
    private String name;
   //@GeneratorColumn(title = "密码")
    @JsonIgnore
    private String password;
   //@GeneratorColumn(title = "用户昵称", condition = true, like = true, or = true, name = "name")
    private String nickName;
   //@GeneratorColumn(title = "部门", condition = true)
    private Integer deptId;
   //@GeneratorColumn(title = "拥有所有内容权限")
    private boolean ownsAllContent;
   //@GeneratorColumn(title = "角色")
    private String roles;
   //@GeneratorColumn(title = "邮箱", condition = true, like = true, or = true, name = "name")
    private String email;
   //@GeneratorColumn(title = "已验证邮箱", condition = true)
    private boolean emailChecked;
   //@GeneratorColumn(title = "是否管理员", condition = true)
    private boolean superuserAccess;
   //@GeneratorColumn(title = "已禁用", condition = true)
    @JsonIgnore
    private boolean disabled;
   //@GeneratorColumn(title = "上次登录日期", condition = true, order = true)
    private Date lastLoginDate;
   //@GeneratorColumn(title = "上次登录IP")
    private String lastLoginIp;
   //@GeneratorColumn(title = "登录次数", order = true)
    private int loginCount;
   //@GeneratorColumn(title = "注册日期", condition = true, order = true)
    private Date registeredDate;

    public SysUser() {
    }

    public SysUser(short siteId, String name, String password, String nickName, boolean ownsAllContent, boolean emailChecked, boolean superuserAccess,
            boolean disabled, int loginCount) {
        this.siteId = siteId;
        this.name = name;
        this.password = password;
        this.nickName = nickName;
        this.ownsAllContent = ownsAllContent;
        this.emailChecked = emailChecked;
        this.superuserAccess = superuserAccess;
        this.disabled = disabled;
        this.loginCount = loginCount;
    }

    public SysUser(short siteId, String name, String password, String nickName, Integer deptId, boolean ownsAllContent, String roles, String email,
            boolean emailChecked, boolean superuserAccess, boolean disabled, Date lastLoginDate, String lastLoginIp,
            int loginCount, Date registeredDate) {
        this.siteId = siteId;
        this.name = name;
        this.password = password;
        this.nickName = nickName;
        this.deptId = deptId;
        this.ownsAllContent = ownsAllContent;
        this.roles = roles;
        this.email = email;
        this.emailChecked = emailChecked;
        this.superuserAccess = superuserAccess;
        this.disabled = disabled;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIp = lastLoginIp;
        this.loginCount = loginCount;
        this.registeredDate = registeredDate;
    }


}
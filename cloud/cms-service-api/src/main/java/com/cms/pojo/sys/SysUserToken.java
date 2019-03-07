package com.cms.pojo.sys;

// Generated 2016-4-14 10:10:32 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * SysUserToken generated by hbm2java
 */

//@Table(name = "sys_user_token")
@Data
public class SysUserToken implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;

   //@GeneratorColumn(title = "授权码")
    private String authToken;
   //@GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
   //@GeneratorColumn(title = "用户", condition = true)
    private long userId;
   //@GeneratorColumn(title = "授权渠道", condition = true)
    private String channel;
   //@GeneratorColumn(title = "授权日期", order = true)
    private Date createDate;
   //@GeneratorColumn(title = "过期日期", order = true)
    private Date expiryDate;
   //@GeneratorColumn(title = "登录IP")
    private String loginIp;

    public SysUserToken() {
    }

    public SysUserToken(String authToken, short siteId, long userId, String channel, Date createDate, String loginIp) {
        this.authToken = authToken;
        this.siteId = siteId;
        this.userId = userId;
        this.channel = channel;
        this.createDate = createDate;
        this.loginIp = loginIp;
    }
    
    public SysUserToken(String authToken, short siteId, long userId, String channel, Date createDate, Date expiryDate, String loginIp) {
        this.authToken = authToken;
        this.siteId = siteId;
        this.userId = userId;
        this.channel = channel;
        this.createDate = createDate;
        this.expiryDate = expiryDate;
        this.loginIp = loginIp;
    }



}
package com.cms.pojo.cms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * CmsWord generated by hbm2java
 */

//@Table(name = "cms_word", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "site_id" }))
@Data
public class CmsWord implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "ID")
    private Long id;
   //@GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
   //@GeneratorColumn(title = "名称", condition = true, like = true)
    private String name;    
   //@GeneratorColumn(title = "搜索次数", order = true)
    private int searchCount;
   //@GeneratorColumn(title = "隐藏", condition = true)
    private boolean hidden;
   //@GeneratorColumn(title = "类型", condition = true, order = true)
    private Date createDate;

    public CmsWord() {
    }

    public CmsWord(short siteId, String name, int searchCount, boolean hidden, Date createDate) {
        this.siteId = siteId;
        this.name = name;
        this.searchCount = searchCount;
        this.hidden = hidden;
        this.createDate = createDate;
    }



}

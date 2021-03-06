package com.cms.pojo.cms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


/**
 * CmsTag generated by hbm2java
 */

//@Table(name = "cms_tag")
@Data
public class CmsTag implements java.io.Serializable {

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
   //@GeneratorColumn(title = "类型", condition = true)
    private Integer typeId;
   //@GeneratorColumn(title = "搜索次数", order = true)
    private int searchCount;

    public CmsTag() {
    }

    public CmsTag(short siteId, String name, int searchCount) {
        this.siteId = siteId;
        this.name = name;
        this.searchCount = searchCount;
    }

    public CmsTag(short siteId, String name, Integer typeId, int searchCount) {
        this.siteId = siteId;
        this.name = name;
        this.typeId = typeId;
        this.searchCount = searchCount;
    }



}

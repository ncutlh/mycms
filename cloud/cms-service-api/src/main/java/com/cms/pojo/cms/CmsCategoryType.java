package com.cms.pojo.cms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * CmsCategoryType generated by hbm2java
 */

//@Table(name = "cms_category_type")
@Data
public class CmsCategoryType implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "ID")
    private Integer id;
   //@GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
   //@GeneratorColumn(title = "名称")
    private String name;
   //@GeneratorColumn(title = "排序")
    private int sort;
   //@GeneratorColumn(title = "扩展ID")
    private Integer extendId;

    public CmsCategoryType() {
    }

    public CmsCategoryType(short siteId, String name, int sort) {
        this.siteId = siteId;
        this.name = name;
        this.sort = sort;
    }

    public CmsCategoryType(short siteId, String name, int sort, Integer extendId) {
        this.siteId = siteId;
        this.name = name;
        this.sort = sort;
        this.extendId = extendId;
    }



}
package com.cms.pojo.cms;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import lombok.Data;



/**
 * CmsCategoryAttribute generated by hbm2java
 */

//@Table(name = "cms_category_attribute")
@Data
public class CmsCategoryAttribute implements java.io.Serializable {

    /**
     * 
     */
    private Integer id;

    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "分类")
    private int categoryId;
   //@GeneratorColumn(title = "标题")
    private String title;
   //@GeneratorColumn(title = "关键词")
    private String keywords;
   //@GeneratorColumn(title = "描述")
    private String description;
   //@GeneratorColumn(title = "扩展数据")
    private String data;

    public CmsCategoryAttribute() {
    }

    public CmsCategoryAttribute(int categoryId) {
        this.categoryId = categoryId;
    }

    public CmsCategoryAttribute(int categoryId, String title, String keywords, String description, String data) {
        this.categoryId = categoryId;
        this.title = title;
        this.keywords = keywords;
        this.description = description;
        this.data = data;
    }


}

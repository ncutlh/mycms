package com.cms.pojo.cms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


/**
 * CmsDictionary generated by hbm2java
 */

//@Table(name = "cms_dictionary")
@Data
public class CmsDictionary implements java.io.Serializable {


    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "ID")
    private Long id;
   //@GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
   //@GeneratorColumn(title = "名称")
    private String name;
   //@GeneratorColumn(title = "允许多选", condition = true)
    private boolean multiple;

    public CmsDictionary() {
    }

    public CmsDictionary(short siteId, String name, boolean multiple) {
        this.siteId = siteId;
        this.name = name;
        this.multiple = multiple;
    }


}

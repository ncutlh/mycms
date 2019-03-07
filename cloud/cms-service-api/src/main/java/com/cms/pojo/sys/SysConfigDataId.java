package com.cms.pojo.sys;
// Generated 2016-12-6 20:53:58 by Hibernate Tools 5.1.0.Beta1

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * SysConfigDataId generated by hbm2java
 */
@Data
public class SysConfigDataId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;

   //@GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
   //@GeneratorColumn(title = "编码", condition = true)
    private String code;

    public SysConfigDataId() {
    }

    public SysConfigDataId(short siteId, String code) {
        this.siteId = siteId;
        this.code = code;
    }



    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysConfigDataId))
            return false;
        SysConfigDataId castOther = (SysConfigDataId) other;

        return (this.getSiteId() == castOther.getSiteId()) && ((this.getCode() == castOther.getCode())
                || (this.getCode() != null && castOther.getCode() != null && this.getCode().equals(castOther.getCode())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getSiteId();
        result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
        return result;
    }

}

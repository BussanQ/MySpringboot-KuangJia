package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("T_ECE_PLANUSERS_DETAIL")
public class PlanUser {
    /**
     * 主键
     */
    private String id;

    /**
     * 人员id
     */
    private String personid;

    /**
     * 人员名字
     */
    private String personname;

    /**
     * 排班ID
     */
    private String planid;

    /**
     * null
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**
     * 主键
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 人员id
     * @return PERSONID 人员id
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * 人员id
     * @param personid 人员id
     */
    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    /**
     * 人员名字
     * @return PERSONNAME 人员名字
     */
    public String getPersonname() {
        return personname;
    }

    /**
     * 人员名字
     * @param personname 人员名字
     */
    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    /**
     * 排班ID
     * @return PLANID 排班ID
     */
    public String getPlanid() {
        return planid;
    }

    /**
     * 排班ID
     * @param planid 排班ID
     */
    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    /**
     * null
     * @return UPDATETIME null
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * null
     * @param updatetime null
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
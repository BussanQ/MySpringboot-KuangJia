package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("T_ECE_PLAN_DETAIL")
public class Plan {
    /**
     * null
     */
    @TableId
    private String planid;

    /**
     * null
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date plantime;

    /**
     * null
     */
    private String createpersonid;

    /**
     * null
     */
    private String createpersonname;

    /**
     * null
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**
     * null
     */
    private String postid;

    /**
     * null
     */
    private String postname;

    /**
     * null
     */
    private String posttype;

    /**
     * null
     */
    private BigDecimal postnum;

    /**
     * null
     */
    private String deptid;

    /**
     * null
     */
    private String deptname;

    /**
     * null
     */
    private String color;

    /**
     * null
     */
    private String thinckness;

    /**
     * null
     */
    private String alpha;

    /**
     * null
     */
    private String postmark;

    /**
     * null
     */
    private String posttaskid;

    /**
     * null
     */
    private String posttaskname;

    /**
     * null
     */
    private String starttime;

    /**
     * null
     */
    private String endtime;

    /**
     * 星期（Mon，Tues，Wed，Thur，Fri,Sat,Sun）
     */
    private String week;

    /**
     * null
     */
    private String dutypersonname;

    /**
     * 岗位是否排完(0:未排完1：已排完)
     */
    private String status;

    /**
     * null
     */
    private String dutypersonid;

    /**
     * null
     */
    private String lochusid;

    /**
     * null
     */
    private String lochusname;

    /**
     * null
     */
    private String carcode;

    /**
     * null
     */
    private String carno;

    /**
     * null
     */
    private String deviceid;

    /**
     * null
     */
    private String markcar;

    /**
     * null
     */
    private String postdetailtype;

    /**
     * null
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**
     * null
     * @return PLANID null
     */
    public String getPlanid() {
        return planid;
    }

    /**
     * null
     * @param planid null
     */
    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    /**
     * null
     * @return PLANTIME null
     */
    public Date getPlantime() {
        return plantime;
    }

    /**
     * null
     * @param plantime null
     */
    public void setPlantime(Date plantime) {
        this.plantime = plantime;
    }

    /**
     * null
     * @return CREATEPERSONID null
     */
    public String getCreatepersonid() {
        return createpersonid;
    }

    /**
     * null
     * @param createpersonid null
     */
    public void setCreatepersonid(String createpersonid) {
        this.createpersonid = createpersonid == null ? null : createpersonid.trim();
    }

    /**
     * null
     * @return CREATEPERSONNAME null
     */
    public String getCreatepersonname() {
        return createpersonname;
    }

    /**
     * null
     * @param createpersonname null
     */
    public void setCreatepersonname(String createpersonname) {
        this.createpersonname = createpersonname == null ? null : createpersonname.trim();
    }

    /**
     * null
     * @return CREATETIME null
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * null
     * @param createtime null
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * null
     * @return POSTID null
     */
    public String getPostid() {
        return postid;
    }

    /**
     * null
     * @param postid null
     */
    public void setPostid(String postid) {
        this.postid = postid == null ? null : postid.trim();
    }

    /**
     * null
     * @return POSTNAME null
     */
    public String getPostname() {
        return postname;
    }

    /**
     * null
     * @param postname null
     */
    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

    /**
     * null
     * @return POSTTYPE null
     */
    public String getPosttype() {
        return posttype;
    }

    /**
     * null
     * @param posttype null
     */
    public void setPosttype(String posttype) {
        this.posttype = posttype == null ? null : posttype.trim();
    }

    /**
     * null
     * @return POSTNUM null
     */
    public BigDecimal getPostnum() {
        return postnum;
    }

    /**
     * null
     * @param postnum null
     */
    public void setPostnum(BigDecimal postnum) {
        this.postnum = postnum;
    }

    /**
     * null
     * @return DEPTID null
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * null
     * @param deptid null
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    /**
     * null
     * @return DEPTNAME null
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * null
     * @param deptname null
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * null
     * @return COLOR null
     */
    public String getColor() {
        return color;
    }

    /**
     * null
     * @param color null
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * null
     * @return THINCKNESS null
     */
    public String getThinckness() {
        return thinckness;
    }

    /**
     * null
     * @param thinckness null
     */
    public void setThinckness(String thinckness) {
        this.thinckness = thinckness == null ? null : thinckness.trim();
    }

    /**
     * null
     * @return ALPHA null
     */
    public String getAlpha() {
        return alpha;
    }

    /**
     * null
     * @param alpha null
     */
    public void setAlpha(String alpha) {
        this.alpha = alpha == null ? null : alpha.trim();
    }

    /**
     * null
     * @return POSTMARK null
     */
    public String getPostmark() {
        return postmark;
    }

    /**
     * null
     * @param postmark null
     */
    public void setPostmark(String postmark) {
        this.postmark = postmark == null ? null : postmark.trim();
    }

    /**
     * null
     * @return POSTTASKID null
     */
    public String getPosttaskid() {
        return posttaskid;
    }

    /**
     * null
     * @param posttaskid null
     */
    public void setPosttaskid(String posttaskid) {
        this.posttaskid = posttaskid == null ? null : posttaskid.trim();
    }

    /**
     * null
     * @return POSTTASKNAME null
     */
    public String getPosttaskname() {
        return posttaskname;
    }

    /**
     * null
     * @param posttaskname null
     */
    public void setPosttaskname(String posttaskname) {
        this.posttaskname = posttaskname == null ? null : posttaskname.trim();
    }

    /**
     * null
     * @return STARTTIME null
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * null
     * @param starttime null
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    /**
     * null
     * @return ENDTIME null
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * null
     * @param endtime null
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    /**
     * 星期（Mon，Tues，Wed，Thur，Fri,Sat,Sun）
     * @return WEEK 星期（Mon，Tues，Wed，Thur，Fri,Sat,Sun）
     */
    public String getWeek() {
        return week;
    }

    /**
     * 星期（Mon，Tues，Wed，Thur，Fri,Sat,Sun）
     * @param week 星期（Mon，Tues，Wed，Thur，Fri,Sat,Sun）
     */
    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    /**
     * null
     * @return DUTYPERSONNAME null
     */
    public String getDutypersonname() {
        return dutypersonname;
    }

    /**
     * null
     * @param dutypersonname null
     */
    public void setDutypersonname(String dutypersonname) {
        this.dutypersonname = dutypersonname == null ? null : dutypersonname.trim();
    }

    /**
     * 岗位是否排完(0:未排完1：已排完)
     * @return STATUS 岗位是否排完(0:未排完1：已排完)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 岗位是否排完(0:未排完1：已排完)
     * @param status 岗位是否排完(0:未排完1：已排完)
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * null
     * @return DUTYPERSONID null
     */
    public String getDutypersonid() {
        return dutypersonid;
    }

    /**
     * null
     * @param dutypersonid null
     */
    public void setDutypersonid(String dutypersonid) {
        this.dutypersonid = dutypersonid == null ? null : dutypersonid.trim();
    }

    /**
     * null
     * @return LOCHUSID null
     */
    public String getLochusid() {
        return lochusid;
    }

    /**
     * null
     * @param lochusid null
     */
    public void setLochusid(String lochusid) {
        this.lochusid = lochusid == null ? null : lochusid.trim();
    }

    /**
     * null
     * @return LOCHUSNAME null
     */
    public String getLochusname() {
        return lochusname;
    }

    /**
     * null
     * @param lochusname null
     */
    public void setLochusname(String lochusname) {
        this.lochusname = lochusname == null ? null : lochusname.trim();
    }

    /**
     * null
     * @return CARCODE null
     */
    public String getCarcode() {
        return carcode;
    }

    /**
     * null
     * @param carcode null
     */
    public void setCarcode(String carcode) {
        this.carcode = carcode == null ? null : carcode.trim();
    }

    /**
     * null
     * @return CARNO null
     */
    public String getCarno() {
        return carno;
    }

    /**
     * null
     * @param carno null
     */
    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    /**
     * null
     * @return DEVICEID null
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * null
     * @param deviceid null
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    /**
     * null
     * @return MARKCAR null
     */
    public String getMarkcar() {
        return markcar;
    }

    /**
     * null
     * @param markcar null
     */
    public void setMarkcar(String markcar) {
        this.markcar = markcar == null ? null : markcar.trim();
    }

    /**
     * null
     * @return POSTDETAILTYPE null
     */
    public String getPostdetailtype() {
        return postdetailtype;
    }

    /**
     * null
     * @param postdetailtype null
     */
    public void setPostdetailtype(String postdetailtype) {
        this.postdetailtype = postdetailtype == null ? null : postdetailtype.trim();
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
package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("T_ECE_PERSON_DETAIL")
public class Person {
    /**
     * 人员编号
     */
    @TableId
    private String personid;

    /**
     * 机构编号
     */
    private String deptid;

    /**
     * 机构名称
     */
    private String deptname;

    /**
     * 人员姓名
     */
    private String personname;

    /**
     * 手台号码
     */
    private String interphoneno;

    /**
     * 人员状态
     */
    private String personstate;

    /**
     * 警号
     */
    private String policeno;

    /**
     * 手机号
     */
    private String phoneno;

    /**
     *  '0：在岗；1：脱岗；2：离线；-1：不当班；3：无定位设备';
     */
    private String dutystate;

    /**
     * 经度
     */
    private BigDecimal x;

    /**
     * 纬度
     */
    private BigDecimal y;

    /**
     * 位置更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**
     * 是否长时间未动 0-否 1-是
     */
    private String movemark;

    /**
     * null
     */
    private String carno;

    /**
     * PDA状态【1.上岗，2.下岗，3，巡逻，4.结束巡逻；5.处理事故】
     */
    private String pdastate;

    /**
     * gps更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date gpstime;

    /**
     * 在岗状态说明
     */
    private String dutystatedesc;

    /**
     * PDA状态说明
     */
    private String pdastatedesc;

    /**
     * 数据入库时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**
     * 现任职务
     */
    private String xrzw;

    /**
     * 人员编号
     * @return PERSONID 人员编号
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * 人员编号
     * @param personid 人员编号
     */
    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    /**
     * 机构编号
     * @return DEPTID 机构编号
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * 机构编号
     * @param deptid 机构编号
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    /**
     * 机构名称
     * @return DEPTNAME 机构名称
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * 机构名称
     * @param deptname 机构名称
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * 人员姓名
     * @return PERSONNAME 人员姓名
     */
    public String getPersonname() {
        return personname;
    }

    /**
     * 人员姓名
     * @param personname 人员姓名
     */
    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    /**
     * 手台号码
     * @return INTERPHONENO 手台号码
     */
    public String getInterphoneno() {
        return interphoneno;
    }

    /**
     * 手台号码
     * @param interphoneno 手台号码
     */
    public void setInterphoneno(String interphoneno) {
        this.interphoneno = interphoneno == null ? null : interphoneno.trim();
    }

    /**
     * 人员状态
     * @return PERSONSTATE 人员状态
     */
    public String getPersonstate() {
        return personstate;
    }

    /**
     * 人员状态
     * @param personstate 人员状态
     */
    public void setPersonstate(String personstate) {
        this.personstate = personstate == null ? null : personstate.trim();
    }

    /**
     * 警号
     * @return POLICENO 警号
     */
    public String getPoliceno() {
        return policeno;
    }

    /**
     * 警号
     * @param policeno 警号
     */
    public void setPoliceno(String policeno) {
        this.policeno = policeno == null ? null : policeno.trim();
    }

    /**
     * 手机号
     * @return PHONENO 手机号
     */
    public String getPhoneno() {
        return phoneno;
    }

    /**
     * 手机号
     * @param phoneno 手机号
     */
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    /**
     *  '0：在岗；1：脱岗；2：离线；-1：不当班；3：无定位设备';
     * @return DUTYSTATE  '0：在岗；1：脱岗；2：离线；-1：不当班；3：无定位设备';
     */
    public String getDutystate() {
        return dutystate;
    }

    /**
     *  '0：在岗；1：脱岗；2：离线；-1：不当班；3：无定位设备';
     * @param dutystate  '0：在岗；1：脱岗；2：离线；-1：不当班；3：无定位设备';
     */
    public void setDutystate(String dutystate) {
        this.dutystate = dutystate == null ? null : dutystate.trim();
    }

    /**
     * 经度
     * @return X 经度
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * 经度
     * @param x 经度
     */
    public void setX(BigDecimal x) {
        this.x = x;
    }

    /**
     * 纬度
     * @return Y 纬度
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * 纬度
     * @param y 纬度
     */
    public void setY(BigDecimal y) {
        this.y = y;
    }

    /**
     * 位置更新时间
     * @return CREATETIME 位置更新时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 位置更新时间
     * @param createtime 位置更新时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 是否长时间未动 0-否 1-是
     * @return MOVEMARK 是否长时间未动 0-否 1-是
     */
    public String getMovemark() {
        return movemark;
    }

    /**
     * 是否长时间未动 0-否 1-是
     * @param movemark 是否长时间未动 0-否 1-是
     */
    public void setMovemark(String movemark) {
        this.movemark = movemark == null ? null : movemark.trim();
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
     * PDA状态【1.上岗，2.下岗，3，巡逻，4.结束巡逻；5.处理事故】
     * @return PDASTATE PDA状态【1.上岗，2.下岗，3，巡逻，4.结束巡逻；5.处理事故】
     */
    public String getPdastate() {
        return pdastate;
    }

    /**
     * PDA状态【1.上岗，2.下岗，3，巡逻，4.结束巡逻；5.处理事故】
     * @param pdastate PDA状态【1.上岗，2.下岗，3，巡逻，4.结束巡逻；5.处理事故】
     */
    public void setPdastate(String pdastate) {
        this.pdastate = pdastate == null ? null : pdastate.trim();
    }

    /**
     * gps更新时间
     * @return GPSTIME gps更新时间
     */
    public Date getGpstime() {
        return gpstime;
    }

    /**
     * gps更新时间
     * @param gpstime gps更新时间
     */
    public void setGpstime(Date gpstime) {
        this.gpstime = gpstime;
    }

    /**
     * 在岗状态说明
     * @return DUTYSTATEDESC 在岗状态说明
     */
    public String getDutystatedesc() {
        return dutystatedesc;
    }

    /**
     * 在岗状态说明
     * @param dutystatedesc 在岗状态说明
     */
    public void setDutystatedesc(String dutystatedesc) {
        this.dutystatedesc = dutystatedesc == null ? null : dutystatedesc.trim();
    }

    /**
     * PDA状态说明
     * @return PDASTATEDESC PDA状态说明
     */
    public String getPdastatedesc() {
        return pdastatedesc;
    }

    /**
     * PDA状态说明
     * @param pdastatedesc PDA状态说明
     */
    public void setPdastatedesc(String pdastatedesc) {
        this.pdastatedesc = pdastatedesc == null ? null : pdastatedesc.trim();
    }

    /**
     * 数据入库时间
     * @return UPDATETIME 数据入库时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 数据入库时间
     * @param updatetime 数据入库时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getXrzw() {
        return xrzw;
    }

    public void setXrzw(String xrzw) {
        this.xrzw = xrzw;
    }
}
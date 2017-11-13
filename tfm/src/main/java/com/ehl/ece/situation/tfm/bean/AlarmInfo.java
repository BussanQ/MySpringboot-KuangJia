package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("T_ECE_ALARM_DETAIL")
public class AlarmInfo {
    /**
     * 警情编号
     */
    @TableId
    private String alarmid;

    /**
     * 从外部接入或按照规则生成的有意义编号
     */
    private String salarmid;

    /**
     * 报警时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date alarmtime;

    /**
     * 报警人
     */
    private String alarmperson;

    /**
     * 报警人电话
     */
    private String alarmpersontel;

    /**
     * 涉事车辆（示例：京A12345,1;京B23456,2）
     */
    private String involvedcar;

    /**
     * 接警人编号
     */
    private String receivepersonid;

    /**
     * 接警人名称
     */
    private String receivepersonname;

    /**
     * 事件来源(字典项3008001)
     */
    private String eventsource;

    /**
     * 事件类型(字典项1008001)
     */
    private String eventtype;

    /**
     * 事件级别(字典项2008001)
     */
    private String eventlevel;

    /**
     * 事件细类
     */
    private String eventthintype;

    /**
     * 报警内容
     */
    private String alarmdesc;

    /**
     * 接警单位编号
     */
    private String mainregionid;

    /**
     * 接警单位名称
     */
    private String mainregionname;

    /**
     * 处警单位编号(公安机构代码-GA380（来源：机构表、辖区图层）)
     */
    private String disposeregionid;

    /**
     * 处警单位名称
     */
    private String disposeregionname;

    /**
     * 经度
     */
    private String x;

    /**
     * 纬度
     */
    private String y;

    /**
     * 报警地点
     */
    private String alarmaddress;

    /**
     * 所属道路编号(来源：城市道路网图层)
     */
    private String roadid;

    /**
     * 所属道路名称
     */
    private String roadname;

    /**
     * 所属道路等级
     */
    private String roadlevel;

    /**
     * 所属重点区域ID(来源：重点区域图层)
     */
    private String importantregionid;

    /**
     * 所属重点区域名称
     */
    private String importantregionname;

    /**
     * 主单编号（合单用）
     */
    private String mainalarmid;

    /**
     * 督办标记(0:未督办，1 督办)
     */
    private String issupervised;

    /**
     * 事件状态,取值：TYPEID="3008002"
     */
    private String eventstate;

    /**
     * 交通设施维护（灯，护栏，大屏）
     */
    private String devicetype;

    /**
     * 派警人ID
     */
    private String assignpersonid;

    /**
     * 派警人姓名
     */
    private String assignpersonname;

    /**
     * 派警时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assigntime;

    /**
     * 处警人编号（0000001;0000002;0000003）
     */
    private String disposepersonid;

    /**
     * 处警人姓名
     */
    private String disposepersonname;

    /**
     * 到警时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date arrivetime;

    /**
     * 处结时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date terminaltime;

    /**
     * 处理结果
     */
    private String disposeresult;

    /**
     * 处理过程
     */
    private String disposerecord;

    /**
     * 月份
     */
    private BigDecimal month;

    /**
     * 事件细类类型编号
     */
    private String eventthintypetypeid;

    /**
     * 处结类型（0: 中心处结;1:手机处结）
     */
    private String terminaltype;

    /**
     * 是否已读（0-未读；1-已读）
     */
    private String isread;

    /**
     * 预留字段
     */
    private String temp1;

    /**
     * 预留字段
     */
    private String temp2;

    /**
     * 预留字段
     */
    private String temp3;

    /**
     * 预留字段
     */
    private String temp4;

    /**
     * 预留字段
     */
    private String temp5;

    /**
     * 预留字段
     */
    private String temp6;

    /**
     * 预留字段
     */
    private String temp7;

    /**
     * 预留字段
     */
    private String temp8;

    /**
     * 预留字段
     */
    private String temp9;

    /**
     * 预留字段
     */
    private String temp10;

    /**
     * 预留字段
     */
    private String temp11;

    /**
     * 预留字段
     */
    private String temp12;

    /**
     * 预留字段
     */
    private String temp13;

    /**
     * 预留字段
     */
    private String temp14;

    /**
     * 预留字段
     */
    private String temp15;

    /**
     * 预留字段
     */
    private String temp16;

    /**
     * 预留字段
     */
    private String temp17;

    /**
     * 预留字段
     */
    private String temp18;

    /**
     * 预留字段
     */
    private String temp19;

    /**
     * 预留字段
     */
    private String temp20;

    /**
     * 事件来源说明
     */
    private String eventsourcedesc;

    /**
     * 事件类型说明
     */
    private String eventtypedesc;

    /**
     * 事件级别说明
     */
    private String eventleveldesc;

    /**
     * 事件细类说明
     */
    private String eventthintypedesc;

    /**
     * 道路等级说明
     */
    private String roadleveldesc;

    /**
     * 关联单号,依据字典：主单，默认0 
     */
    private String linkid;

    /**
     * 设备来源
     */
    private String sbly;

    /**
     * 设备编号
     */
    private String sbbh;

    /**
     * 检测时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date jcsj;

    /**
     * 报警人单位
     */
    private String alarmunit;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 报警辖区
     */
    private String alarmregion;

    /**
     * 报警辖区编号
     */
    private String alarmregionid;

    /**
     * 事件状态说明
     */
    private String eventstatedesc;

    /**
     * "接警人编号,当前处理人 "
     */
    private String answerpersonid;

    /**
     * 接警人姓名
     */
    private String answerpersonname;

    /**
     * 接警单位编号
     */
    private String answerunitid;

    /**
     * 接警单位名称
     */
    private String answerunitname;

    /**
     * 派警类型,取值：TYPEID="3008006"
     */
    private String assigntype;

    /**
     * 派警类型说明
     */
    private String assigntypedesc;

    /**
     * "处警时间,第三方系统进入，自动带的时间 "
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date disposetime;

    /**
     * "处警单位编号,第三方系统带入 "
     */
    private String disposeunitid;

    /**
     * "处警单位名称,第三方系统带入 "
     */
    private String disposeunitname;

    /**
     * "是否督办,取值：0-没督办，1-督办，默认为0 "
     */
    private String issupervise;

    /**
     * 数据入库时间，默认值sysdate, 格式:YYYY-MM-DD hh:mm:ss
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**
     * 同步标识，取值：0-未同步，1-同步成功， 2-同步失败，默认为0
     */
    private String mark;

    /**
     * 热力值（由警情研判分析系统统计结转服务计算）
     */
    private Integer heatvalue;

    /**
     * 警情编号
     * @return ALARMID 警情编号
     */
    public String getAlarmid() {
        return alarmid;
    }

    /**
     * 警情编号
     * @param alarmid 警情编号
     */
    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid == null ? null : alarmid.trim();
    }

    /**
     * 从外部接入或按照规则生成的有意义编号
     * @return SALARMID 从外部接入或按照规则生成的有意义编号
     */
    public String getSalarmid() {
        return salarmid;
    }

    /**
     * 从外部接入或按照规则生成的有意义编号
     * @param salarmid 从外部接入或按照规则生成的有意义编号
     */
    public void setSalarmid(String salarmid) {
        this.salarmid = salarmid == null ? null : salarmid.trim();
    }

    /**
     * 报警时间
     * @return ALARMTIME 报警时间
     */
    public Date getAlarmtime() {
        return alarmtime;
    }

    /**
     * 报警时间
     * @param alarmtime 报警时间
     */
    public void setAlarmtime(Date alarmtime) {
        this.alarmtime = alarmtime;
    }

    /**
     * 报警人
     * @return ALARMPERSON 报警人
     */
    public String getAlarmperson() {
        return alarmperson;
    }

    /**
     * 报警人
     * @param alarmperson 报警人
     */
    public void setAlarmperson(String alarmperson) {
        this.alarmperson = alarmperson == null ? null : alarmperson.trim();
    }

    /**
     * 报警人电话
     * @return ALARMPERSONTEL 报警人电话
     */
    public String getAlarmpersontel() {
        return alarmpersontel;
    }

    /**
     * 报警人电话
     * @param alarmpersontel 报警人电话
     */
    public void setAlarmpersontel(String alarmpersontel) {
        this.alarmpersontel = alarmpersontel == null ? null : alarmpersontel.trim();
    }

    /**
     * 涉事车辆（示例：京A12345,1;京B23456,2）
     * @return INVOLVEDCAR 涉事车辆（示例：京A12345,1;京B23456,2）
     */
    public String getInvolvedcar() {
        return involvedcar;
    }

    /**
     * 涉事车辆（示例：京A12345,1;京B23456,2）
     * @param involvedcar 涉事车辆（示例：京A12345,1;京B23456,2）
     */
    public void setInvolvedcar(String involvedcar) {
        this.involvedcar = involvedcar == null ? null : involvedcar.trim();
    }

    /**
     * 接警人编号
     * @return RECEIVEPERSONID 接警人编号
     */
    public String getReceivepersonid() {
        return receivepersonid;
    }

    /**
     * 接警人编号
     * @param receivepersonid 接警人编号
     */
    public void setReceivepersonid(String receivepersonid) {
        this.receivepersonid = receivepersonid == null ? null : receivepersonid.trim();
    }

    /**
     * 接警人名称
     * @return RECEIVEPERSONNAME 接警人名称
     */
    public String getReceivepersonname() {
        return receivepersonname;
    }

    /**
     * 接警人名称
     * @param receivepersonname 接警人名称
     */
    public void setReceivepersonname(String receivepersonname) {
        this.receivepersonname = receivepersonname == null ? null : receivepersonname.trim();
    }

    /**
     * 事件来源(字典项3008001)
     * @return EVENTSOURCE 事件来源(字典项3008001)
     */
    public String getEventsource() {
        return eventsource;
    }

    /**
     * 事件来源(字典项3008001)
     * @param eventsource 事件来源(字典项3008001)
     */
    public void setEventsource(String eventsource) {
        this.eventsource = eventsource == null ? null : eventsource.trim();
    }

    /**
     * 事件类型(字典项1008001)
     * @return EVENTTYPE 事件类型(字典项1008001)
     */
    public String getEventtype() {
        return eventtype;
    }

    /**
     * 事件类型(字典项1008001)
     * @param eventtype 事件类型(字典项1008001)
     */
    public void setEventtype(String eventtype) {
        this.eventtype = eventtype == null ? null : eventtype.trim();
    }

    /**
     * 事件级别(字典项2008001)
     * @return EVENTLEVEL 事件级别(字典项2008001)
     */
    public String getEventlevel() {
        return eventlevel;
    }

    /**
     * 事件级别(字典项2008001)
     * @param eventlevel 事件级别(字典项2008001)
     */
    public void setEventlevel(String eventlevel) {
        this.eventlevel = eventlevel == null ? null : eventlevel.trim();
    }

    /**
     * 事件细类
     * @return EVENTTHINTYPE 事件细类
     */
    public String getEventthintype() {
        return eventthintype;
    }

    /**
     * 事件细类
     * @param eventthintype 事件细类
     */
    public void setEventthintype(String eventthintype) {
        this.eventthintype = eventthintype == null ? null : eventthintype.trim();
    }

    /**
     * 报警内容
     * @return ALARMDESC 报警内容
     */
    public String getAlarmdesc() {
        return alarmdesc;
    }

    /**
     * 报警内容
     * @param alarmdesc 报警内容
     */
    public void setAlarmdesc(String alarmdesc) {
        this.alarmdesc = alarmdesc == null ? null : alarmdesc.trim();
    }

    /**
     * 接警单位编号
     * @return MAINREGIONID 接警单位编号
     */
    public String getMainregionid() {
        return mainregionid;
    }

    /**
     * 接警单位编号
     * @param mainregionid 接警单位编号
     */
    public void setMainregionid(String mainregionid) {
        this.mainregionid = mainregionid == null ? null : mainregionid.trim();
    }

    /**
     * 接警单位名称
     * @return MAINREGIONNAME 接警单位名称
     */
    public String getMainregionname() {
        return mainregionname;
    }

    /**
     * 接警单位名称
     * @param mainregionname 接警单位名称
     */
    public void setMainregionname(String mainregionname) {
        this.mainregionname = mainregionname == null ? null : mainregionname.trim();
    }

    /**
     * 处警单位编号(公安机构代码-GA380（来源：机构表、辖区图层）)
     * @return DISPOSEREGIONID 处警单位编号(公安机构代码-GA380（来源：机构表、辖区图层）)
     */
    public String getDisposeregionid() {
        return disposeregionid;
    }

    /**
     * 处警单位编号(公安机构代码-GA380（来源：机构表、辖区图层）)
     * @param disposeregionid 处警单位编号(公安机构代码-GA380（来源：机构表、辖区图层）)
     */
    public void setDisposeregionid(String disposeregionid) {
        this.disposeregionid = disposeregionid == null ? null : disposeregionid.trim();
    }

    /**
     * 处警单位名称
     * @return DISPOSEREGIONNAME 处警单位名称
     */
    public String getDisposeregionname() {
        return disposeregionname;
    }

    /**
     * 处警单位名称
     * @param disposeregionname 处警单位名称
     */
    public void setDisposeregionname(String disposeregionname) {
        this.disposeregionname = disposeregionname == null ? null : disposeregionname.trim();
    }

    /**
     * 经度
     * @return X 经度
     */
    public String getX() {
        return x;
    }

    /**
     * 经度
     * @param x 经度
     */
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    /**
     * 纬度
     * @return Y 纬度
     */
    public String getY() {
        return y;
    }

    /**
     * 纬度
     * @param y 纬度
     */
    public void setY(String y) {
        this.y = y == null ? null : y.trim();
    }

    /**
     * 报警地点
     * @return ALARMADDRESS 报警地点
     */
    public String getAlarmaddress() {
        return alarmaddress;
    }

    /**
     * 报警地点
     * @param alarmaddress 报警地点
     */
    public void setAlarmaddress(String alarmaddress) {
        this.alarmaddress = alarmaddress == null ? null : alarmaddress.trim();
    }

    /**
     * 所属道路编号(来源：城市道路网图层)
     * @return ROADID 所属道路编号(来源：城市道路网图层)
     */
    public String getRoadid() {
        return roadid;
    }

    /**
     * 所属道路编号(来源：城市道路网图层)
     * @param roadid 所属道路编号(来源：城市道路网图层)
     */
    public void setRoadid(String roadid) {
        this.roadid = roadid == null ? null : roadid.trim();
    }

    /**
     * 所属道路名称
     * @return ROADNAME 所属道路名称
     */
    public String getRoadname() {
        return roadname;
    }

    /**
     * 所属道路名称
     * @param roadname 所属道路名称
     */
    public void setRoadname(String roadname) {
        this.roadname = roadname == null ? null : roadname.trim();
    }

    /**
     * 所属道路等级
     * @return ROADLEVEL 所属道路等级
     */
    public String getRoadlevel() {
        return roadlevel;
    }

    /**
     * 所属道路等级
     * @param roadlevel 所属道路等级
     */
    public void setRoadlevel(String roadlevel) {
        this.roadlevel = roadlevel == null ? null : roadlevel.trim();
    }

    /**
     * 所属重点区域ID(来源：重点区域图层)
     * @return IMPORTANTREGIONID 所属重点区域ID(来源：重点区域图层)
     */
    public String getImportantregionid() {
        return importantregionid;
    }

    /**
     * 所属重点区域ID(来源：重点区域图层)
     * @param importantregionid 所属重点区域ID(来源：重点区域图层)
     */
    public void setImportantregionid(String importantregionid) {
        this.importantregionid = importantregionid == null ? null : importantregionid.trim();
    }

    /**
     * 所属重点区域名称
     * @return IMPORTANTREGIONNAME 所属重点区域名称
     */
    public String getImportantregionname() {
        return importantregionname;
    }

    /**
     * 所属重点区域名称
     * @param importantregionname 所属重点区域名称
     */
    public void setImportantregionname(String importantregionname) {
        this.importantregionname = importantregionname == null ? null : importantregionname.trim();
    }

    /**
     * 主单编号（合单用）
     * @return MAINALARMID 主单编号（合单用）
     */
    public String getMainalarmid() {
        return mainalarmid;
    }

    /**
     * 主单编号（合单用）
     * @param mainalarmid 主单编号（合单用）
     */
    public void setMainalarmid(String mainalarmid) {
        this.mainalarmid = mainalarmid == null ? null : mainalarmid.trim();
    }

    /**
     * 督办标记(0:未督办，1 督办)
     * @return ISSUPERVISED 督办标记(0:未督办，1 督办)
     */
    public String getIssupervised() {
        return issupervised;
    }

    /**
     * 督办标记(0:未督办，1 督办)
     * @param issupervised 督办标记(0:未督办，1 督办)
     */
    public void setIssupervised(String issupervised) {
        this.issupervised = issupervised == null ? null : issupervised.trim();
    }

    /**
     * 事件状态,取值：TYPEID="3008002"
     * @return EVENTSTATE 事件状态,取值：TYPEID="3008002"
     */
    public String getEventstate() {
        return eventstate;
    }

    /**
     * 事件状态,取值：TYPEID="3008002"
     * @param eventstate 事件状态,取值：TYPEID="3008002"
     */
    public void setEventstate(String eventstate) {
        this.eventstate = eventstate == null ? null : eventstate.trim();
    }

    /**
     * 交通设施维护（灯，护栏，大屏）
     * @return DEVICETYPE 交通设施维护（灯，护栏，大屏）
     */
    public String getDevicetype() {
        return devicetype;
    }

    /**
     * 交通设施维护（灯，护栏，大屏）
     * @param devicetype 交通设施维护（灯，护栏，大屏）
     */
    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype == null ? null : devicetype.trim();
    }

    /**
     * 派警人ID
     * @return ASSIGNPERSONID 派警人ID
     */
    public String getAssignpersonid() {
        return assignpersonid;
    }

    /**
     * 派警人ID
     * @param assignpersonid 派警人ID
     */
    public void setAssignpersonid(String assignpersonid) {
        this.assignpersonid = assignpersonid == null ? null : assignpersonid.trim();
    }

    /**
     * 派警人姓名
     * @return ASSIGNPERSONNAME 派警人姓名
     */
    public String getAssignpersonname() {
        return assignpersonname;
    }

    /**
     * 派警人姓名
     * @param assignpersonname 派警人姓名
     */
    public void setAssignpersonname(String assignpersonname) {
        this.assignpersonname = assignpersonname == null ? null : assignpersonname.trim();
    }

    /**
     * 派警时间
     * @return ASSIGNTIME 派警时间
     */
    public Date getAssigntime() {
        return assigntime;
    }

    /**
     * 派警时间
     * @param assigntime 派警时间
     */
    public void setAssigntime(Date assigntime) {
        this.assigntime = assigntime;
    }

    /**
     * 处警人编号（0000001;0000002;0000003）
     * @return DISPOSEPERSONID 处警人编号（0000001;0000002;0000003）
     */
    public String getDisposepersonid() {
        return disposepersonid;
    }

    /**
     * 处警人编号（0000001;0000002;0000003）
     * @param disposepersonid 处警人编号（0000001;0000002;0000003）
     */
    public void setDisposepersonid(String disposepersonid) {
        this.disposepersonid = disposepersonid == null ? null : disposepersonid.trim();
    }

    /**
     * 处警人姓名
     * @return DISPOSEPERSONNAME 处警人姓名
     */
    public String getDisposepersonname() {
        return disposepersonname;
    }

    /**
     * 处警人姓名
     * @param disposepersonname 处警人姓名
     */
    public void setDisposepersonname(String disposepersonname) {
        this.disposepersonname = disposepersonname == null ? null : disposepersonname.trim();
    }

    /**
     * 到警时间
     * @return ARRIVETIME 到警时间
     */
    public Date getArrivetime() {
        return arrivetime;
    }

    /**
     * 到警时间
     * @param arrivetime 到警时间
     */
    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    /**
     * 处结时间
     * @return TERMINALTIME 处结时间
     */
    public Date getTerminaltime() {
        return terminaltime;
    }

    /**
     * 处结时间
     * @param terminaltime 处结时间
     */
    public void setTerminaltime(Date terminaltime) {
        this.terminaltime = terminaltime;
    }

    /**
     * 处理结果
     * @return DISPOSERESULT 处理结果
     */
    public String getDisposeresult() {
        return disposeresult;
    }

    /**
     * 处理结果
     * @param disposeresult 处理结果
     */
    public void setDisposeresult(String disposeresult) {
        this.disposeresult = disposeresult == null ? null : disposeresult.trim();
    }

    /**
     * 处理过程
     * @return DISPOSERECORD 处理过程
     */
    public String getDisposerecord() {
        return disposerecord;
    }

    /**
     * 处理过程
     * @param disposerecord 处理过程
     */
    public void setDisposerecord(String disposerecord) {
        this.disposerecord = disposerecord == null ? null : disposerecord.trim();
    }

    /**
     * 月份
     * @return MONTH 月份
     */
    public BigDecimal getMonth() {
        return month;
    }

    /**
     * 月份
     * @param month 月份
     */
    public void setMonth(BigDecimal month) {
        this.month = month;
    }

    /**
     * 事件细类类型编号
     * @return EVENTTHINTYPETYPEID 事件细类类型编号
     */
    public String getEventthintypetypeid() {
        return eventthintypetypeid;
    }

    /**
     * 事件细类类型编号
     * @param eventthintypetypeid 事件细类类型编号
     */
    public void setEventthintypetypeid(String eventthintypetypeid) {
        this.eventthintypetypeid = eventthintypetypeid == null ? null : eventthintypetypeid.trim();
    }

    /**
     * 处结类型（0: 中心处结;1:手机处结）
     * @return TERMINALTYPE 处结类型（0: 中心处结;1:手机处结）
     */
    public String getTerminaltype() {
        return terminaltype;
    }

    /**
     * 处结类型（0: 中心处结;1:手机处结）
     * @param terminaltype 处结类型（0: 中心处结;1:手机处结）
     */
    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype == null ? null : terminaltype.trim();
    }

    /**
     * 是否已读（0-未读；1-已读）
     * @return ISREAD 是否已读（0-未读；1-已读）
     */
    public String getIsread() {
        return isread;
    }

    /**
     * 是否已读（0-未读；1-已读）
     * @param isread 是否已读（0-未读；1-已读）
     */
    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }

    /**
     * 预留字段
     * @return TEMP1 预留字段
     */
    public String getTemp1() {
        return temp1;
    }

    /**
     * 预留字段
     * @param temp1 预留字段
     */
    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    /**
     * 预留字段
     * @return TEMP2 预留字段
     */
    public String getTemp2() {
        return temp2;
    }

    /**
     * 预留字段
     * @param temp2 预留字段
     */
    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    /**
     * 预留字段
     * @return TEMP3 预留字段
     */
    public String getTemp3() {
        return temp3;
    }

    /**
     * 预留字段
     * @param temp3 预留字段
     */
    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }

    /**
     * 预留字段
     * @return TEMP4 预留字段
     */
    public String getTemp4() {
        return temp4;
    }

    /**
     * 预留字段
     * @param temp4 预留字段
     */
    public void setTemp4(String temp4) {
        this.temp4 = temp4 == null ? null : temp4.trim();
    }

    /**
     * 预留字段
     * @return TEMP5 预留字段
     */
    public String getTemp5() {
        return temp5;
    }

    /**
     * 预留字段
     * @param temp5 预留字段
     */
    public void setTemp5(String temp5) {
        this.temp5 = temp5 == null ? null : temp5.trim();
    }

    /**
     * 预留字段
     * @return TEMP6 预留字段
     */
    public String getTemp6() {
        return temp6;
    }

    /**
     * 预留字段
     * @param temp6 预留字段
     */
    public void setTemp6(String temp6) {
        this.temp6 = temp6 == null ? null : temp6.trim();
    }

    /**
     * 预留字段
     * @return TEMP7 预留字段
     */
    public String getTemp7() {
        return temp7;
    }

    /**
     * 预留字段
     * @param temp7 预留字段
     */
    public void setTemp7(String temp7) {
        this.temp7 = temp7 == null ? null : temp7.trim();
    }

    /**
     * 预留字段
     * @return TEMP8 预留字段
     */
    public String getTemp8() {
        return temp8;
    }

    /**
     * 预留字段
     * @param temp8 预留字段
     */
    public void setTemp8(String temp8) {
        this.temp8 = temp8 == null ? null : temp8.trim();
    }

    /**
     * 预留字段
     * @return TEMP9 预留字段
     */
    public String getTemp9() {
        return temp9;
    }

    /**
     * 预留字段
     * @param temp9 预留字段
     */
    public void setTemp9(String temp9) {
        this.temp9 = temp9 == null ? null : temp9.trim();
    }

    /**
     * 预留字段
     * @return TEMP10 预留字段
     */
    public String getTemp10() {
        return temp10;
    }

    /**
     * 预留字段
     * @param temp10 预留字段
     */
    public void setTemp10(String temp10) {
        this.temp10 = temp10 == null ? null : temp10.trim();
    }

    /**
     * 预留字段
     * @return TEMP11 预留字段
     */
    public String getTemp11() {
        return temp11;
    }

    /**
     * 预留字段
     * @param temp11 预留字段
     */
    public void setTemp11(String temp11) {
        this.temp11 = temp11 == null ? null : temp11.trim();
    }

    /**
     * 预留字段
     * @return TEMP12 预留字段
     */
    public String getTemp12() {
        return temp12;
    }

    /**
     * 预留字段
     * @param temp12 预留字段
     */
    public void setTemp12(String temp12) {
        this.temp12 = temp12 == null ? null : temp12.trim();
    }

    /**
     * 预留字段
     * @return TEMP13 预留字段
     */
    public String getTemp13() {
        return temp13;
    }

    /**
     * 预留字段
     * @param temp13 预留字段
     */
    public void setTemp13(String temp13) {
        this.temp13 = temp13 == null ? null : temp13.trim();
    }

    /**
     * 预留字段
     * @return TEMP14 预留字段
     */
    public String getTemp14() {
        return temp14;
    }

    /**
     * 预留字段
     * @param temp14 预留字段
     */
    public void setTemp14(String temp14) {
        this.temp14 = temp14 == null ? null : temp14.trim();
    }

    /**
     * 预留字段
     * @return TEMP15 预留字段
     */
    public String getTemp15() {
        return temp15;
    }

    /**
     * 预留字段
     * @param temp15 预留字段
     */
    public void setTemp15(String temp15) {
        this.temp15 = temp15 == null ? null : temp15.trim();
    }

    /**
     * 预留字段
     * @return TEMP16 预留字段
     */
    public String getTemp16() {
        return temp16;
    }

    /**
     * 预留字段
     * @param temp16 预留字段
     */
    public void setTemp16(String temp16) {
        this.temp16 = temp16 == null ? null : temp16.trim();
    }

    /**
     * 预留字段
     * @return TEMP17 预留字段
     */
    public String getTemp17() {
        return temp17;
    }

    /**
     * 预留字段
     * @param temp17 预留字段
     */
    public void setTemp17(String temp17) {
        this.temp17 = temp17 == null ? null : temp17.trim();
    }

    /**
     * 预留字段
     * @return TEMP18 预留字段
     */
    public String getTemp18() {
        return temp18;
    }

    /**
     * 预留字段
     * @param temp18 预留字段
     */
    public void setTemp18(String temp18) {
        this.temp18 = temp18 == null ? null : temp18.trim();
    }

    /**
     * 预留字段
     * @return TEMP19 预留字段
     */
    public String getTemp19() {
        return temp19;
    }

    /**
     * 预留字段
     * @param temp19 预留字段
     */
    public void setTemp19(String temp19) {
        this.temp19 = temp19 == null ? null : temp19.trim();
    }

    /**
     * 预留字段
     * @return TEMP20 预留字段
     */
    public String getTemp20() {
        return temp20;
    }

    /**
     * 预留字段
     * @param temp20 预留字段
     */
    public void setTemp20(String temp20) {
        this.temp20 = temp20 == null ? null : temp20.trim();
    }

    /**
     * 事件来源说明
     * @return EVENTSOURCEDESC 事件来源说明
     */
    public String getEventsourcedesc() {
        return eventsourcedesc;
    }

    /**
     * 事件来源说明
     * @param eventsourcedesc 事件来源说明
     */
    public void setEventsourcedesc(String eventsourcedesc) {
        this.eventsourcedesc = eventsourcedesc == null ? null : eventsourcedesc.trim();
    }

    /**
     * 事件类型说明
     * @return EVENTTYPEDESC 事件类型说明
     */
    public String getEventtypedesc() {
        return eventtypedesc;
    }

    /**
     * 事件类型说明
     * @param eventtypedesc 事件类型说明
     */
    public void setEventtypedesc(String eventtypedesc) {
        this.eventtypedesc = eventtypedesc == null ? null : eventtypedesc.trim();
    }

    /**
     * 事件级别说明
     * @return EVENTLEVELDESC 事件级别说明
     */
    public String getEventleveldesc() {
        return eventleveldesc;
    }

    /**
     * 事件级别说明
     * @param eventleveldesc 事件级别说明
     */
    public void setEventleveldesc(String eventleveldesc) {
        this.eventleveldesc = eventleveldesc == null ? null : eventleveldesc.trim();
    }

    /**
     * 事件细类说明
     * @return EVENTTHINTYPEDESC 事件细类说明
     */
    public String getEventthintypedesc() {
        return eventthintypedesc;
    }

    /**
     * 事件细类说明
     * @param eventthintypedesc 事件细类说明
     */
    public void setEventthintypedesc(String eventthintypedesc) {
        this.eventthintypedesc = eventthintypedesc == null ? null : eventthintypedesc.trim();
    }

    /**
     * 道路等级说明
     * @return ROADLEVELDESC 道路等级说明
     */
    public String getRoadleveldesc() {
        return roadleveldesc;
    }

    /**
     * 道路等级说明
     * @param roadleveldesc 道路等级说明
     */
    public void setRoadleveldesc(String roadleveldesc) {
        this.roadleveldesc = roadleveldesc == null ? null : roadleveldesc.trim();
    }

    /**
     * 关联单号,依据字典：主单，默认0 
     * @return LINKID 关联单号,依据字典：主单，默认0 
     */
    public String getLinkid() {
        return linkid;
    }

    /**
     * 关联单号,依据字典：主单，默认0 
     * @param linkid 关联单号,依据字典：主单，默认0 
     */
    public void setLinkid(String linkid) {
        this.linkid = linkid == null ? null : linkid.trim();
    }

    /**
     * 设备来源
     * @return SBLY 设备来源
     */
    public String getSbly() {
        return sbly;
    }

    /**
     * 设备来源
     * @param sbly 设备来源
     */
    public void setSbly(String sbly) {
        this.sbly = sbly == null ? null : sbly.trim();
    }

    /**
     * 设备编号
     * @return SBBH 设备编号
     */
    public String getSbbh() {
        return sbbh;
    }

    /**
     * 设备编号
     * @param sbbh 设备编号
     */
    public void setSbbh(String sbbh) {
        this.sbbh = sbbh == null ? null : sbbh.trim();
    }

    /**
     * 检测时间
     * @return JCSJ 检测时间
     */
    public Date getJcsj() {
        return jcsj;
    }

    /**
     * 检测时间
     * @param jcsj 检测时间
     */
    public void setJcsj(Date jcsj) {
        this.jcsj = jcsj;
    }

    /**
     * 报警人单位
     * @return ALARMUNIT 报警人单位
     */
    public String getAlarmunit() {
        return alarmunit;
    }

    /**
     * 报警人单位
     * @param alarmunit 报警人单位
     */
    public void setAlarmunit(String alarmunit) {
        this.alarmunit = alarmunit == null ? null : alarmunit.trim();
    }

    /**
     * 经度
     * @return LONGITUDE 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 经度
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 纬度
     * @return LATITUDE 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 纬度
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 报警辖区
     * @return ALARMREGION 报警辖区
     */
    public String getAlarmregion() {
        return alarmregion;
    }

    /**
     * 报警辖区
     * @param alarmregion 报警辖区
     */
    public void setAlarmregion(String alarmregion) {
        this.alarmregion = alarmregion == null ? null : alarmregion.trim();
    }

    /**
     * 报警辖区编号
     * @return ALARMREGIONID 报警辖区编号
     */
    public String getAlarmregionid() {
        return alarmregionid;
    }

    /**
     * 报警辖区编号
     * @param alarmregionid 报警辖区编号
     */
    public void setAlarmregionid(String alarmregionid) {
        this.alarmregionid = alarmregionid == null ? null : alarmregionid.trim();
    }

    /**
     * 事件状态说明
     * @return EVENTSTATEDESC 事件状态说明
     */
    public String getEventstatedesc() {
        return eventstatedesc;
    }

    /**
     * 事件状态说明
     * @param eventstatedesc 事件状态说明
     */
    public void setEventstatedesc(String eventstatedesc) {
        this.eventstatedesc = eventstatedesc == null ? null : eventstatedesc.trim();
    }

    /**
     * "接警人编号,当前处理人 "
     * @return ANSWERPERSONID "接警人编号,当前处理人 "
     */
    public String getAnswerpersonid() {
        return answerpersonid;
    }

    /**
     * "接警人编号,当前处理人 "
     * @param answerpersonid "接警人编号,当前处理人 "
     */
    public void setAnswerpersonid(String answerpersonid) {
        this.answerpersonid = answerpersonid == null ? null : answerpersonid.trim();
    }

    /**
     * 接警人姓名
     * @return ANSWERPERSONNAME 接警人姓名
     */
    public String getAnswerpersonname() {
        return answerpersonname;
    }

    /**
     * 接警人姓名
     * @param answerpersonname 接警人姓名
     */
    public void setAnswerpersonname(String answerpersonname) {
        this.answerpersonname = answerpersonname == null ? null : answerpersonname.trim();
    }

    /**
     * 接警单位编号
     * @return ANSWERUNITID 接警单位编号
     */
    public String getAnswerunitid() {
        return answerunitid;
    }

    /**
     * 接警单位编号
     * @param answerunitid 接警单位编号
     */
    public void setAnswerunitid(String answerunitid) {
        this.answerunitid = answerunitid == null ? null : answerunitid.trim();
    }

    /**
     * 接警单位名称
     * @return ANSWERUNITNAME 接警单位名称
     */
    public String getAnswerunitname() {
        return answerunitname;
    }

    /**
     * 接警单位名称
     * @param answerunitname 接警单位名称
     */
    public void setAnswerunitname(String answerunitname) {
        this.answerunitname = answerunitname == null ? null : answerunitname.trim();
    }

    /**
     * 派警类型,取值：TYPEID="3008006"
     * @return ASSIGNTYPE 派警类型,取值：TYPEID="3008006"
     */
    public String getAssigntype() {
        return assigntype;
    }

    /**
     * 派警类型,取值：TYPEID="3008006"
     * @param assigntype 派警类型,取值：TYPEID="3008006"
     */
    public void setAssigntype(String assigntype) {
        this.assigntype = assigntype == null ? null : assigntype.trim();
    }

    /**
     * 派警类型说明
     * @return ASSIGNTYPEDESC 派警类型说明
     */
    public String getAssigntypedesc() {
        return assigntypedesc;
    }

    /**
     * 派警类型说明
     * @param assigntypedesc 派警类型说明
     */
    public void setAssigntypedesc(String assigntypedesc) {
        this.assigntypedesc = assigntypedesc == null ? null : assigntypedesc.trim();
    }

    /**
     * "处警时间,第三方系统进入，自动带的时间 "
     * @return DISPOSETIME "处警时间,第三方系统进入，自动带的时间 "
     */
    public Date getDisposetime() {
        return disposetime;
    }

    /**
     * "处警时间,第三方系统进入，自动带的时间 "
     * @param disposetime "处警时间,第三方系统进入，自动带的时间 "
     */
    public void setDisposetime(Date disposetime) {
        this.disposetime = disposetime;
    }

    /**
     * "处警单位编号,第三方系统带入 "
     * @return DISPOSEUNITID "处警单位编号,第三方系统带入 "
     */
    public String getDisposeunitid() {
        return disposeunitid;
    }

    /**
     * "处警单位编号,第三方系统带入 "
     * @param disposeunitid "处警单位编号,第三方系统带入 "
     */
    public void setDisposeunitid(String disposeunitid) {
        this.disposeunitid = disposeunitid == null ? null : disposeunitid.trim();
    }

    /**
     * "处警单位名称,第三方系统带入 "
     * @return DISPOSEUNITNAME "处警单位名称,第三方系统带入 "
     */
    public String getDisposeunitname() {
        return disposeunitname;
    }

    /**
     * "处警单位名称,第三方系统带入 "
     * @param disposeunitname "处警单位名称,第三方系统带入 "
     */
    public void setDisposeunitname(String disposeunitname) {
        this.disposeunitname = disposeunitname == null ? null : disposeunitname.trim();
    }

    /**
     * "是否督办,取值：0-没督办，1-督办，默认为0 "
     * @return ISSUPERVISE "是否督办,取值：0-没督办，1-督办，默认为0 "
     */
    public String getIssupervise() {
        return issupervise;
    }

    /**
     * "是否督办,取值：0-没督办，1-督办，默认为0 "
     * @param issupervise "是否督办,取值：0-没督办，1-督办，默认为0 "
     */
    public void setIssupervise(String issupervise) {
        this.issupervise = issupervise == null ? null : issupervise.trim();
    }

    /**
     * 数据入库时间，默认值sysdate, 格式:YYYY-MM-DD hh:mm:ss
     * @return UPDATETIME 数据入库时间，默认值sysdate, 格式:YYYY-MM-DD hh:mm:ss
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 数据入库时间，默认值sysdate, 格式:YYYY-MM-DD hh:mm:ss
     * @param updatetime 数据入库时间，默认值sysdate, 格式:YYYY-MM-DD hh:mm:ss
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 同步标识，取值：0-未同步，1-同步成功， 2-同步失败，默认为0
     * @return MARK 同步标识，取值：0-未同步，1-同步成功， 2-同步失败，默认为0
     */
    public String getMark() {
        return mark;
    }

    /**
     * 同步标识，取值：0-未同步，1-同步成功， 2-同步失败，默认为0
     * @param mark 同步标识，取值：0-未同步，1-同步成功， 2-同步失败，默认为0
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * 热力值（由警情研判分析系统统计结转服务计算）
     * @return HEATVALUE 热力值（由警情研判分析系统统计结转服务计算）
     */
    public Integer getHeatvalue() {
        return heatvalue;
    }

    /**
     * 热力值（由警情研判分析系统统计结转服务计算）
     * @param heatvalue 热力值（由警情研判分析系统统计结转服务计算）
     */
    public void setHeatvalue(Integer heatvalue) {
        this.heatvalue = heatvalue;
    }
}
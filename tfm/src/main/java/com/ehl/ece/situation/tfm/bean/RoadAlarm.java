package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author lizh
 * @date 2017/11/2
 */
public class RoadAlarm {
	/**
	 * 拥堵标识号
	 */
	String alarmNum;

	/**
	 * 路段名称
	 */
	String routeName;

	/**
	 * 语义化描述
	 */
	String sectionDescription;

	/**
	 * 路段尾坐标（经纬度）
	 */
	String xy;

	/**
	 * 预警级别
	 */
	String alarmLevel;

	/**
	 * 数据产生时间
	 */
	@JSONField(format = "yyyyMMddHHmm")
	Date datatime;

	/**
	 * 报警开始时间
	 */
	@JSONField(format = "yyyyMMddHHmm")
	Date alarmStarttime;

	/**
	 * 报警状态
	 * 正在报警 1 延续报警 2 消散报警 3
	 */
	String alarmStatus;

	/**
	 * 报警持续时间
	 */
	String alarmDuration;

	/**
	 * 拥堵持续时间
	 */
	String durationTime;

	/**
	 * 拥堵指数
	 */
	double congestIndex;

	/**
	 * 拥堵距离
	 */
	double congestLength;

	/**
	 * 平均速度
	 */
	double speed;

	/**
	 * 报警路段的坐标集合
	 */
	String paths;

	/**
	 * 拥堵距离预警等级
	 */
	String lengthAlarmLevel;

	/**
	 * 拥堵持续时间预警等级
	 */
	String durationAlarmLevel;

	/**
	 * 拥堵指数预警等级
	 */
	String indexAlarmLevel;

	/**
	 * 异常拥堵预警等级
	 */
	String abnormalAlarmLevel;

	/**
	 * 是否是异常拥堵
	 */
	String isAbnormal;

	public String getAlarmNum() {
		return alarmNum;
	}

	public void setAlarmNum(String alarmNum) {
		this.alarmNum = alarmNum;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getSectionDescription() {
		return sectionDescription;
	}

	public void setSectionDescription(String sectionDescription) {
		this.sectionDescription = sectionDescription;
	}

	public String getXy() {
		return xy;
	}

	public void setXy(String xy) {
		this.xy = xy;
	}

	public String getAlarmLevel() {
		return alarmLevel;
	}

	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}

	public Date getDatatime() {
		return datatime;
	}

	public void setDatatime(Date datatime) {
		this.datatime = datatime;
	}

	public Date getAlarmStarttime() {
		return alarmStarttime;
	}

	public void setAlarmStarttime(Date alarmStarttime) {
		this.alarmStarttime = alarmStarttime;
	}

	public String getAlarmStatus() {
		return alarmStatus;
	}

	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
	}

	public String getAlarmDuration() {
		return alarmDuration;
	}

	public void setAlarmDuration(String alarmDuration) {
		this.alarmDuration = alarmDuration;
	}

	public String getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(String durationTime) {
		this.durationTime = durationTime;
	}

	public double getCongestIndex() {
		return congestIndex;
	}

	public void setCongestIndex(double congestIndex) {
		this.congestIndex = congestIndex;
	}

	public double getCongestLength() {
		return congestLength;
	}

	public void setCongestLength(double congestLength) {
		this.congestLength = congestLength;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getPaths() {
		return paths;
	}

	public void setPaths(String paths) {
		this.paths = paths;
	}

	public String getLengthAlarmLevel() {
		return lengthAlarmLevel;
	}

	public void setLengthAlarmLevel(String lengthAlarmLevel) {
		this.lengthAlarmLevel = lengthAlarmLevel;
	}

	public String getDurationAlarmLevel() {
		return durationAlarmLevel;
	}

	public void setDurationAlarmLevel(String durationAlarmLevel) {
		this.durationAlarmLevel = durationAlarmLevel;
	}

	public String getIndexAlarmLevel() {
		return indexAlarmLevel;
	}

	public void setIndexAlarmLevel(String indexAlarmLevel) {
		this.indexAlarmLevel = indexAlarmLevel;
	}

	public String getAbnormalAlarmLevel() {
		return abnormalAlarmLevel;
	}

	public void setAbnormalAlarmLevel(String abnormalAlarmLevel) {
		this.abnormalAlarmLevel = abnormalAlarmLevel;
	}

	public String getIsAbnormal() {
		return isAbnormal;
	}

	public void setIsAbnormal(String isAbnormal) {
		this.isAbnormal = isAbnormal;
	}
}

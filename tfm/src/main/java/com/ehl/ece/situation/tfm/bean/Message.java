package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * @author lizh
 * @date 2017/10/31
 */
public class Message {

	/**
	 * 数据状态 0正常、-1无数据
	 */
	private String msg;

	/**
	 * 城市道路实时拥堵数据列表
	 */
	private List<RoadRank> list;

	/**
	 * 异常拥堵路段数据
	 */
	private List<RoadAlarm> roadAlarmList;

	/**
	 * 数据粒度(分钟)
	 */
	private String interval;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date sendTime;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public List<RoadRank> getList() {
		return list;
	}

	public void setList(List<RoadRank> list) {
		this.list = list;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public List<RoadAlarm> getRoadAlarmList() {
		return roadAlarmList;
	}

	public void setRoadAlarmList(List<RoadAlarm> roadAlarmList) {
		this.roadAlarmList = roadAlarmList;
	}
}

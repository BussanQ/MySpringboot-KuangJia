package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 城市拥堵数据
 * @author lizh
 * @date 2017/10/31
 */
public class CityCongestion {

	/**
	 * 唯一编号
	 */
	private String id;

	/**
	 * 数据更新时间
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date dateTime;

	/**
	 * 城市名称
	 */
	private String cityName;

	/**
	 * 交通拥堵指数
	 */
	private String index;

	/**
	 * 路网平均速度，km/h
	 */
	private double speed;

	/**
	 * 拥堵道路数
	 */
	@JSONField(name = "number")
	private int roadNumber;

	/**
	 * 严重拥堵里程，km
	 */
	@JSONField(name = "congest_length_4")
	private double seriousConLength;

	/**
	 * 拥堵里程，km
	 */
	@JSONField(name = "congest_length_3")
	private double conLength;

	/**
	 * 缓行里程，km
	 */
	@JSONField(name = "congest_length_2")
	private double ambleLength;

	/**
	 * 城区类型编码
	 * 0：全市、1：主城区
	 */
	private String districtType = "0";

	/**
	 * 道路类型编码
	 * 0：全部道路、1：高速、2：环路及快速路
	 * 3：主干、4：次干、5：支干
	 */
	private String roadType = "0";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRoadNumber() {
		return roadNumber;
	}

	public void setRoadNumber(int roadNumber) {
		this.roadNumber = roadNumber;
	}

	public double getSeriousConLength() {
		return seriousConLength;
	}

	public void setSeriousConLength(double seriousConLength) {
		this.seriousConLength = seriousConLength;
	}

	public double getConLength() {
		return conLength;
	}

	public void setConLength(double conLength) {
		this.conLength = conLength;
	}

	public double getAmbleLength() {
		return ambleLength;
	}

	public void setAmbleLength(double ambleLength) {
		this.ambleLength = ambleLength;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}
}

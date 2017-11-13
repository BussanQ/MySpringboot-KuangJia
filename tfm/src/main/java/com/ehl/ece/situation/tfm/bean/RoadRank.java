package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * 城市道路拥堵数据
 * @author lizh
 * @date 2017/10/27
 */
public class RoadRank {

	/**
	 * 唯一编号
	 */
	String id ;

	/**
	 * 数据更新时间
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:00")
	Date dateTime = new Date();

	/**
	 * 城市名称
	 */
	String cityName;

	/**
	 * 拥堵道路名称
	 */
	String name;

	/**
	 * 拥堵道路位置
	 */
	String description;

	/**
	 * 交通拥堵指数
	 */
	double index;

	/**
	 * 路网平均速度，km/h
	 */
	double speed;

	/**
	 * 拥堵里程，km
	 */
	@JSONField(name = "congest_length")
	private double conLength;

	/**
	 * 城区类型编码
	 * 0：全市、1：主城区
	 */
	String districtType = "0";

	/**
	 * 道路类型编码
	 * 0：全部道路、1：高速、2：环路及快速路
	 * 3：主干、4：次干、5：支干
	 */
	String roadType = "0";

	/**
	 * 道路经纬度列表集合字符串
	 */
	List<String>  location;

	/**
	 * 道路经纬度列表
	 */
//	List<String> location;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getIndex() {
		return index;
	}

	public void setIndex(double index) {
		this.index = index;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
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

/*	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		*//*if (location != null && location.size() > 0)
		{
			this.location = StrUtils.join(location.toArray(new String[location.size()]),";");
		}
		else
			this.location = "";*//*
	}*/

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	public double getConLength() {
		return conLength;
	}

	public void setConLength(double conLength) {
		this.conLength = conLength;
	}
}

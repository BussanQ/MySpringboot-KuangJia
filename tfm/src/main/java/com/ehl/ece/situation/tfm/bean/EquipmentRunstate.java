package com.ehl.ece.situation.tfm.bean;

public class EquipmentRunstate {

	//设备类型名称
	private String name;
	//设备类型代码
	private String type;
	//设备正常运行数
	private Integer normalCount;
	//设备总数
	private Integer totalCount;
	//更新时间
	private String dateTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getNormalCount() {
		return normalCount;
	}
	public void setNormalCount(Integer normalCount) {
		this.normalCount = normalCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
}

package com.ehl.ece.situation.tfm.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * 交通管理指数
 * @author lizh
 * @date 2017/11/3
 */
@TableName("T_ECE_TFM_MANAGEINDEX")
public class TrafficManageindex {
	//名称
	private String name;
	//更新时间(yyyy-mm-dd HH24:mi:ss)
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date datetime;
	//交通管理指数
	private Double manageindex;
	//影响指数1(拥堵指数)
	private Double index_1;
	//影响指数2(警情指数)
	private Double index_2;
	//影响指数3(警力指数)
	private Double index_3;
	//影响指数4(拥堵与警力匹配度指数)
	private Double index_4;
	//影响指数5(警情与警力匹配度指数)
	private Double index_5;
	//影响指数6(警力执行效率指数)
	private Double index_6;
	//影响指数7(万人违法量)
	private Double index_7;
	//影响指数8(万车违法量)
	private Double index_8;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getManageindex() {
		return manageindex;
	}
	public void setManageindex(Double manageindex) {
		this.manageindex = manageindex;
	}
	public Double getIndex_1() {
		return index_1;
	}
	public void setIndex_1(Double index_1) {
		this.index_1 = index_1;
	}
	public Double getIndex_2() {
		return index_2;
	}
	public void setIndex_2(Double index_2) {
		this.index_2 = index_2;
	}
	public Double getIndex_3() {
		return index_3;
	}
	public void setIndex_3(Double index_3) {
		this.index_3 = index_3;
	}
	public Double getIndex_4() {
		return index_4;
	}
	public void setIndex_4(Double index_4) {
		this.index_4 = index_4;
	}
	public Double getIndex_5() {
		return index_5;
	}
	public void setIndex_5(Double index_5) {
		this.index_5 = index_5;
	}
	public Double getIndex_6() {
		return index_6;
	}
	public void setIndex_6(Double index_6) {
		this.index_6 = index_6;
	}
	public Double getIndex_7() {
		return index_7;
	}
	public void setIndex_7(Double index_7) {
		this.index_7 = index_7;
	}
	public Double getIndex_8() {
		return index_8;
	}
	public void setIndex_8(Double index_8) {
		this.index_8 = index_8;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
}

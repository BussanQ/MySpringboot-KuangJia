package com.bussanq.group.alpha.bean;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;

/**
 * @author lizh
 * @date 2017/11/18
 */
public class UserData {
	String url;
	Date updatetime;
	@TableId
	String userid;
	String title;

	/**
	 *
	 * @param url
	 * @param userid
	 * @param title
	 */
	public UserData(String url,String userid,String title){
		this.url = url;
		this.userid = userid;
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

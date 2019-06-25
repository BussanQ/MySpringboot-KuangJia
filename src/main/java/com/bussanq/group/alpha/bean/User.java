package com.bussanq.group.alpha.bean;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/***
创建数据库用户表：
 CREATE TABLE `user` (
 `login_id` varchar(20) NOT NULL COMMENT '登陆ID',
 `pwd` varchar(20) NOT NULL COMMENT '用户密码',
 `name` varchar(100) NOT NULL COMMENT '用户姓名',
 `age` int(3) NOT NULL COMMENT '用户年龄',
 `sex` varchar(3) NOT NULL COMMENT '性别',
 `duty` varchar(15) COMMENT '职务',
 `cell_number` varchar(15) COMMENT '手机号',
 `photo_url` varchar(75) COMMENT '头像地址',
 `used` boolean NOT NULL COMMENT '账号是否可用',
 `session_id` varchar(45) COMMENT '当前登录的sessionId',
 PRIMARY KEY (`login_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';
 */

public class User implements Serializable {
    private String name;    //名字
    private String sex; //性别
    @TableId
    @TableField("login_id")
    private String loginId; //登陆ID
    private String pwd;    //密码
    private String duty;    //职务
    private int age;    //年龄
    @TableField("cell_number")
    private String cellNumber;  //手机号
    @TableField("photo_url")
    private String photoUrl;    //头像地址
    private boolean used = true;   //是否可用,默认值是true
    private String nextUrl; //下一步的的操作地址
    private String session_id;


    
    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", loginId='" + loginId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", duty='" + duty + '\'' +
                ", age=" + age +
                ", cellNumber='" + cellNumber + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", used=" + used +
                '}';
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }
}

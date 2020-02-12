package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:02 2020/2/12
 */
public class User {
    private BigDecimal userId;
    private String username;
    private String password;
    private String realName;
    private BigDecimal age;
    private BigDecimal limitId;
    private BigDecimal faceInfoId;
    private String IDCard;
    private String phone;
    private String address;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public BigDecimal getLimitId() {
        return limitId;
    }

    public void setLimitId(BigDecimal limitId) {
        this.limitId = limitId;
    }

    public BigDecimal getFaceInfoId() {
        return faceInfoId;
    }

    public void setFaceInfoId(BigDecimal faceInfoId) {
        this.faceInfoId = faceInfoId;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

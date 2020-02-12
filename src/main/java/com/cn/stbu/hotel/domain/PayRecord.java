package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:55 2020/2/12
 */
public class PayRecord {
    private BigDecimal payRecordId;
    private BigDecimal userId;
    private BigDecimal productId;
    private BigDecimal cashierId;
    private BigDecimal amount;
    private BigDecimal money;
    private Timestamp payTime;
    private String pDescribe;

    public BigDecimal getPayRecordId() {
        return payRecordId;
    }

    public void setPayRecordId(BigDecimal payRecordId) {
        this.payRecordId = payRecordId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public BigDecimal getCashierId() {
        return cashierId;
    }

    public void setCashierId(BigDecimal cashierId) {
        this.cashierId = cashierId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public String getpDescribe() {
        return pDescribe;
    }

    public void setpDescribe(String pDescribe) {
        this.pDescribe = pDescribe;
    }
}

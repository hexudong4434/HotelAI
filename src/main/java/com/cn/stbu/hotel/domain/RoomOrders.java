package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:01 2020/2/12
 */
public class RoomOrders {
    private String roomOrderId;
    private int userId;
    private BigDecimal sale;
    private Timestamp bookTime;
    private Timestamp startTime;
    private Timestamp endTime;

    public String getRoomOrderId() {
        return roomOrderId;
    }

    public void setRoomOrderId(String roomOrderId) {
        this.roomOrderId = roomOrderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public Timestamp getBookTime() {
        return bookTime;
    }

    public void setBookTime(Timestamp bookTime) {
        this.bookTime = bookTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}

package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:12 2020/2/12
 */
public class VipInfo {
    private BigDecimal vipId;
    private BigDecimal userId;
    private Timestamp startTime;
    private Timestamp endTime;

    public BigDecimal getVipId() {
        return vipId;
    }

    public void setVipId(BigDecimal vipId) {
        this.vipId = vipId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
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

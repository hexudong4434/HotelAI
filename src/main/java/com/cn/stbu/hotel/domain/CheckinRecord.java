package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:51 2020/2/12
 */
public class CheckinRecord {
    private BigDecimal CIId;
    private BigDecimal userId;
    private BigDecimal status;
    private Timestamp ciTime;
    private Timestamp coTime;
    private String cDescribe;

    public BigDecimal getCIId() {
        return CIId;
    }

    public void setCIId(BigDecimal CIId) {
        this.CIId = CIId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public Timestamp getCiTime() {
        return ciTime;
    }

    public void setCiTime(Timestamp ciTime) {
        this.ciTime = ciTime;
    }

    public Timestamp getCoTime() {
        return coTime;
    }

    public void setCoTime(Timestamp coTime) {
        this.coTime = coTime;
    }

    public String getcDescribe() {
        return cDescribe;
    }

    public void setcDescribe(String cDescribe) {
        this.cDescribe = cDescribe;
    }
}

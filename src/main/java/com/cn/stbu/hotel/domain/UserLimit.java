package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:11 2020/2/12
 */
public class UserLimit {
    private BigDecimal limitId;
    private String roleName;

    public BigDecimal getLimitId() {
        return limitId;
    }

    public void setLimitId(BigDecimal limitId) {
        this.limitId = limitId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

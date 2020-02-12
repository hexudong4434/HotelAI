package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:31 2020/2/12
 */
public class Amount {
    private BigDecimal amountId;
    private BigDecimal userId;
    private BigDecimal balance;
    private BigDecimal oweMoney;

    public BigDecimal getAmountId() {
        return amountId;
    }

    public void setAmountId(BigDecimal amountId) {
        this.amountId = amountId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getOweMoney() {
        return oweMoney;
    }

    public void setOweMoney(BigDecimal oweMoney) {
        this.oweMoney = oweMoney;
    }
}

package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:31 2020/2/12
 */
public class Amounts {
    private int amountId;
    private int userId;
    private BigDecimal balance;
    private BigDecimal oweMoney;

    public int getAmountId() {
        return amountId;
    }

    public void setAmountId(int amountId) {
        this.amountId = amountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

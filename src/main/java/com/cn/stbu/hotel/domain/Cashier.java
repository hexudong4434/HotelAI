package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:50 2020/2/12
 */
public class Cashier {
    private BigDecimal cashierId;
    private String cashierName;

    public BigDecimal getCashierId() {
        return cashierId;
    }

    public void setCashierId(BigDecimal cashierId) {
        this.cashierId = cashierId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
}

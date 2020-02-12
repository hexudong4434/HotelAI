package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:58 2020/2/12
 */
public class Product {
    private BigDecimal productId;
    private String pName;
    private BigDecimal classId;
    private BigDecimal sale;
    private BigDecimal pSurplus;

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public BigDecimal getClassId() {
        return classId;
    }

    public void setClassId(BigDecimal classId) {
        this.classId = classId;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public BigDecimal getpSurplus() {
        return pSurplus;
    }

    public void setpSurplus(BigDecimal pSurplus) {
        this.pSurplus = pSurplus;
    }
}

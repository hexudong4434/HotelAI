package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 02:01 2020/2/12
 */
public class RoomOrder {
    private BigDecimal roomOrderId;
    private BigDecimal userId;
    private BigDecimal sale;
    private Timestamp bookTime;
    private Timestamp startTime;
    private Timestamp endTime;
}

package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @author Ecifics
 * @Description 用户下单交易模型
 * @date 5/17/2022-9:30 PM
 */
public class OrderModel {

    private String id;

    private Integer userId;

    private Integer itemId;

    /**
     * 购买数量
     */
    private Integer amount;

    /**
     * 商品单价
     */
    private BigDecimal itemPrice;

    /**
     * 购买金额
     */
    private BigDecimal orderPrice;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
}

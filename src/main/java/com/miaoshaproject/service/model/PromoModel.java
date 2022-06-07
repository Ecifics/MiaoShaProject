package com.miaoshaproject.service.model;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Ecifics
 * @Description 秒杀营销模型
 * @date 5/20/2022-9:27 AM
 */
public class PromoModel implements Serializable {

    private Integer id;

    /**
     * 秒杀活动状态 1==>还未开始，2==>进行中，3==>已结束
     */
    private Integer status;

    /**
     * 秒杀活动名称
     */
    private String promoName;

    /**
     * 秒杀活动开始时间
     */
    private DateTime startDate;

    /**
     * 秒杀活动结束时间
     */
    private DateTime endDate;

    /**
     * 秒杀活动使用商品
     */
    private Integer itemId;

    /**
     * 秒杀活动商品价格
     */
    private BigDecimal promoItemPrices;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromoItemPrices() {
        return promoItemPrices;
    }

    public void setPromoItemPrices(BigDecimal promoItemPrices) {
        this.promoItemPrices = promoItemPrices;
    }
}

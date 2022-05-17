package com.miaoshaproject.controller.viewobject;

import java.math.BigDecimal;

/**
 * @author Ecifics
 * @Description 商品表示层对象
 * @date 5/17/2022-12:13 PM
 */
public class ItemVO {
    private Integer id;

    /**
     * 商品名称
     */
    private String title;

    private BigDecimal price;

    private Integer stock;

    private String description;

    private Integer sales;

    /**
     * 商品图片链接
     */
    private String imgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

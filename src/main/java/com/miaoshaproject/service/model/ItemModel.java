package com.miaoshaproject.service.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Ecifics
 * @Description 商品model层对象
 * @date 5/17/2022-9:05 AM
 */
public class ItemModel implements Serializable {
    private Integer id;

    /**
     * 商品名称
     */
    @NotBlank(message = "商品名称不能为空")
    private String title;

    @NotNull(message = "商品价格不能为空")
    @Min(value = 0, message = "商品价格必须大于零")
    private BigDecimal price;

    @NotNull(message = "库存必须填写")
    private Integer stock;

    @NotBlank(message = "商品描述信息不能为空")
    private String description;

    private Integer sales;

    /**
     * 商品图片链接
     */
    @NotBlank(message = "图片不能为空")
    private String imgUrl;

    /**
     * 聚合秒杀对象，如果promoModel不为空，则表示其在未结束的秒杀活动商品中
     */
    private PromoModel promoModel;

    public PromoModel getPromoModel() {
        return promoModel;
    }

    public void setPromoModel(PromoModel promoModel) {
        this.promoModel = promoModel;
    }

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

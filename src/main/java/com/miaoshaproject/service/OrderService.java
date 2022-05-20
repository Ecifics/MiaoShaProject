package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @author Ecifics
 * @Description 订单层接口
 * @date 5/17/2022-9:52 PM
 */
public interface OrderService {

    /**
     * 通过前端url上传过来的秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已开始（建议采用）
     * 或者直接在下单接口内判断商品是否存在秒杀活动，如果存在则以秒杀价格下单
     * @param userId - id of user
     * @param itemId - id of item
     * @param amount - amount of item which wanna to buy
     * @param promoId - id of promo
     * @return
     * @throws BusinessException
     */
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}

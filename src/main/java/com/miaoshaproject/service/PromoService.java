package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author Ecifics
 * @Description 秒杀活动模型接口
 * @date 5/20/2022-9:41 AM
 */
public interface PromoService {

    /**
     * 根据itemId获取即将进行或正在进行的秒杀活动
     * @param itemId - id of item
     * @return PromoModel
     */
    PromoModel getPromoByItemId(Integer itemId);
}

package com.miaoshaproject.service.impl;

import com.miaoshaproject.dao.PromoDOMapper;
import com.miaoshaproject.pojo.PromoDO;
import com.miaoshaproject.service.PromoService;
import com.miaoshaproject.service.model.PromoModel;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Ecifics
 * @Description 秒杀活动模型实现
 * @date 5/20/2022-9:42 AM
 */
@Service
public class PromoServiceImpl implements PromoService {

    @Autowired
    private PromoDOMapper promoDOMapper;

    @Override
    public PromoModel getPromoByItemId(Integer itemId) {
        // 获取对应商品的秒杀活动信息
        PromoDO promoDO = promoDOMapper.selectByItemId(itemId);

        // pojo ==> model
        PromoModel promoModel = convertModelFromPojo(promoDO);
        if (promoModel == null) {
            return null;
        }

        // 判断是否处在秒杀活动时间段内或者即将开始
        DateTime now = new DateTime();
        if (promoModel.getStartDate().isAfterNow()) {
            promoModel.setStatus(1);
        }

        if (promoModel.getStartDate().isBeforeNow() && promoModel.getEndDate().isAfterNow()) {
            promoModel.setStatus(2);
        }

        if (promoModel.getEndDate().isBeforeNow()) {
            promoModel.setStatus(3);
        }



        return promoModel;
    }

    private PromoModel convertModelFromPojo(PromoDO promoDO) {
        if (promoDO == null) {
            return null;
        }

        PromoModel promoModel = new PromoModel();
        BeanUtils.copyProperties(promoDO, promoModel);
        promoModel.setPromoItemPrices(BigDecimal.valueOf(promoDO.getPromoItemPrice()));
        promoModel.setStartDate(new DateTime(promoDO.getStartDate()));
        promoModel.setEndDate(new DateTime(promoDO.getEndDate()));

        return promoModel;
    }
}

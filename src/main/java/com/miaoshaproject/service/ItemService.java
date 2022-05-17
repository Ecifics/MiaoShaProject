package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @author Ecifics
 * @Description 商品模块接口
 * @date 5/17/2022-9:18 AM
 */
public interface ItemService {

    /**
     * 创建商品
     * @param itemModel - item object in service model
     * @return ItemMode object
     */
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    /**
     * 商品列表
     * @return list of items which are been specified
     */
    List<ItemModel> listItem();

    /**
     * 商品详情
     * @param id - specific item id
     * @return item object
     */
    ItemModel getItem(Integer id);
}
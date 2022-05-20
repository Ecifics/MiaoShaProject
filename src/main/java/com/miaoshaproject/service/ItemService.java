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
     * @exception BusinessException - personal exception
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
    ItemModel getItemById(Integer id);

    /**
     * 库存扣减
     * @param itemId - id of item
     * @param amount - amount of item
     * @return boolean - check if it is success
     * @exception BusinessException - error
     */
    boolean descreaseStock(Integer itemId, Integer amount) throws BusinessException;


    /**
     * 销量增加
     * @param itemId  - id of item
     * @param amount - amount of item
     * @exception  BusinessException - error
     */
    void increaseSales(Integer itemId, Integer amount) throws BusinessException;
}

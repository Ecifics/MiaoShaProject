package com.miaoshaproject.dao;

import com.miaoshaproject.pojo.ItemStockDO;
import org.apache.ibatis.annotations.Param;

public interface ItemStockDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemStockDO record);

    int insertSelective(ItemStockDO record);

    ItemStockDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemStockDO record);

    int updateByPrimaryKey(ItemStockDO record);

    ItemStockDO selectByItemId(@Param("itemId") Integer itemId);

    int descreaseStock(@Param("itemId") Integer itemId, @Param("amount") Integer amount);
}
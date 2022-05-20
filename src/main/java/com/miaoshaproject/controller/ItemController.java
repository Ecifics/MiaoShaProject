package com.miaoshaproject.controller;

import com.miaoshaproject.controller.viewobject.ItemVO;
import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.ItemService;
import com.miaoshaproject.service.model.ItemModel;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ecifics
 * @Description 商品表示层
 * @date 5/17/2022-12:12 PM
 */
@RestController("item")
@RequestMapping("/item")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class ItemController extends BaseController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/create", consumes = {CONTENT_TYPE_FORMED})
    public CommonReturnType createItem(@RequestParam("title") String title,
                                       @RequestParam("description") String description,
                                       @RequestParam("price") BigDecimal price,
                                       @RequestParam("stock") Integer stock,
                                       @RequestParam("imgUrl") String imgUrl) throws BusinessException {
        //封装service请求用来创建商品
        ItemModel itemModel = new ItemModel();
        itemModel.setTitle(title);
        itemModel.setPrice(price);
        itemModel.setStock(stock);
        itemModel.setImgUrl(imgUrl);
        itemModel.setDescription(description);

        ItemModel itemModelFromService = itemService.createItem(itemModel);

        ItemVO itemVO = convertItemVOFromModel(itemModelFromService);

        return CommonReturnType.create(itemVO);
    }

    @GetMapping("/list")
    public CommonReturnType listItem() {
        List<ItemModel> itemModelList = itemService.listItem();

        List<ItemVO> itemVOList = itemModelList.stream().map(itemModel -> {
            return convertItemVOFromModel(itemModel);
        }).collect(Collectors.toList());

        return CommonReturnType.create(itemVOList);
    }

    @GetMapping("/get")
    public CommonReturnType getItem(@RequestParam("id") Integer id) {
        ItemModel itemModel = itemService.getItemById(id);

        ItemVO itemVO = convertItemVOFromModel(itemModel);

        return CommonReturnType.create(itemVO);
    }

    private ItemVO convertItemVOFromModel(ItemModel itemModel) {
        if (itemModel == null) {
            return null;
        }

        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(itemModel, itemVO);

        // 判断该商品是否有秒杀活动
        // 没有秒杀活动
        if (itemModel.getPromoModel() == null) {
            itemVO.setPromoStatus(0);
        }

        // 有秒杀活动
        if (itemModel.getPromoModel() != null) {
            itemVO.setPromoStatus(itemModel.getPromoModel().getStatus());
            itemVO.setPromoId(itemModel.getPromoModel().getId());
            itemVO.setStartDate(itemModel.getPromoModel().getStartDate().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            itemVO.setPromoPrice(itemModel.getPromoModel().getPromoItemPrices());
        }

        return itemVO;
    }
}

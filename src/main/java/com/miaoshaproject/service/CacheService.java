package com.miaoshaproject.service;

/**
 * @author Ecifics
 * @Description TODO
 * @date 6/7/2022-9:43 PM
 */
public interface CacheService {

    /**
     * 向缓存中存数据
     * @param key
     * @param value
     */
    void setCommonCache(String key, Object value);

    /**
     * 从缓存中取数据
     * @param key
     */
    Object getFromCommonCache(String key);
}

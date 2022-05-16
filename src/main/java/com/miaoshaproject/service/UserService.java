package com.miaoshaproject.service;


import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @author Ecifics
 * @Description 用户service层接口
 * @date 5/14/2022-7:30 PM
 */
public interface UserService {

    /**
     * 根据用户id获取用户
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册
     * @param userModel object
     */
    void register(UserModel userModel) throws BusinessException;
}

package com.miaoshaproject.service;


import com.miaoshaproject.service.model.UserModel;

/**
 * @author Ecifics
 * @Description TODO
 * @date 5/14/2022-7:30 PM
 */
public interface UserService {

    /**
     * 根据用户id获取用户
     */
    UserModel getUserById(Integer id);
}

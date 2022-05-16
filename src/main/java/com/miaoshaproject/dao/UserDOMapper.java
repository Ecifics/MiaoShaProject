package com.miaoshaproject.dao;

import com.miaoshaproject.pojo.UserDO;

/**
 * @author Ecifics
 * 用户表操作实体类
 */
public interface UserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}
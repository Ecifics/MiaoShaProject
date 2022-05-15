package com.miaoshaproject.dao;

import com.miaoshaproject.pojo.UserPasswordDO;
import org.apache.ibatis.annotations.Param;

public interface UserPasswordDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPasswordDO record);

    int insertSelective(UserPasswordDO record);

    UserPasswordDO selectByUserId(@Param("userId") Integer userId);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}
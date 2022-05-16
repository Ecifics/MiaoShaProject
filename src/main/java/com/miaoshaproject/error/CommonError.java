package com.miaoshaproject.error;

/**
 * @author Ecifics
 * @Description 异常接口
 * @date 5/14/2022-10:45 PM
 */
public interface CommonError {

    int getErrCode();

    String getErrMsg();

    CommonError setErrMsg(String errMsg);
}

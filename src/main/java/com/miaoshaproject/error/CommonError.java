package com.miaoshaproject.error;

/**
 * @author Ecifics
 * @Description TODO
 * @date 5/14/2022-10:45 PM
 */
public interface CommonError {

    int getErrCode();

    String getErrMsg();

    CommonError setErrMsg(String errMsg);
}

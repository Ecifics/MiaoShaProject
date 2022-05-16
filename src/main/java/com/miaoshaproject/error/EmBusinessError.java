package com.miaoshaproject.error;

/**
 * @author Ecifics
 * @Description 异常枚举类
 * @date 5/14/2022-10:46 PM
 */
public enum EmBusinessError implements CommonError {
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),

    UNKNOWN_ERROR(10002, "未知错误"),

    USER_NOT_EXIST(20001, "用户不存在"),

    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确")
    ;

    private int errCode;

    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}

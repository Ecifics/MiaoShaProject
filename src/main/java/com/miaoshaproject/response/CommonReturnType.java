package com.miaoshaproject.response;

/**
 * @author Ecifics
 * @Description 通用返回类，用于将数据返回到前端
 * @date 5/14/2022-8:04 PM
 */
public class CommonReturnType {

    private String status;

    private Object data;

    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String success) {
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setStatus(success);
        commonReturnType.setData(result);

        return commonReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

package com.ykx.backend.common;

import com.ykx.backend.exception.ErrorCode;

public class ResultUtils {
 /**
  * 成功
  */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }
    /**
     * 失败
     */
    public static <T> BaseResponse<?> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }
    public static <T> BaseResponse<?> error(int code,String message){
        return  new BaseResponse<>(code,null,message);
    }
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}

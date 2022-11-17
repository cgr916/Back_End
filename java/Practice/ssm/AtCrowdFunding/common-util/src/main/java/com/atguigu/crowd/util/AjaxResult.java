package com.atguigu.crowd.util;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author: cgr
 * @date: 2022/7/16 - 14:56
 */
public class AjaxResult <T>{
    private static final String SUCCESS = "Success";
    private static final String FAILED = "Failed";
    private String resCode;
    private String resMsg;
    private T data;

    public AjaxResult() {
    }

    public AjaxResult(String resCode, String resMsg, T data) {
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.data = data;
    }

    public static <E> AjaxResult<E> successWithoutData(){
        return new AjaxResult<>(SUCCESS,null,null);
    }

    public static <E> AjaxResult<E> successWithData(E data){
        return new AjaxResult<>(SUCCESS,null,data);
    }

    public static <E> AjaxResult<E> failed(String msg){
        return new AjaxResult<>(FAILED,msg,null);
    }

    public String getResCode() {
        return resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public T getData() {
        return data;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "resCode='" + resCode + '\'' +
                ", resMsg='" + resMsg + '\'' +
                ", data=" + data +
                '}';
    }
}

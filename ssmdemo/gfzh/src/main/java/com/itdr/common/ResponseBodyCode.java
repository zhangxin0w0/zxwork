package com.itdr.common;

import java.io.Serializable;

/**
 * ClassName: ResponseBody
 * 日期: 2019/10/21 17:03
 *
 * @author Air张
 * @since JDK 1.8
 */

public class ResponseBodyCode<T>{
    private Integer status;
    private T data;
    private String msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private ResponseBodyCode(Integer status, Object data){

    }

    private ResponseBodyCode(Integer status,String msg){

    }

    private ResponseBodyCode(T data){
        this.data = data;
        this.status=200;
    }

    private ResponseBodyCode(String msg){

    }

    public static<T> ResponseBodyCode successData(T data){
        return new ResponseBodyCode(data);
    }
}

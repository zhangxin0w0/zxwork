package com.itdr.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * ClassName: ServerResponse
 * 日期: 2020/11/2 16:54
 *
 * @author Air张
 * @since JDK 1.8
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    private ServerResponse(T data){
        this.code = 200;
        this.data = data;
    }

    private ServerResponse(String msg){
        this.code = 100;
        this.msg = msg;
    }

    public static <T> ServerResponse toSuccess(T data){
        return new ServerResponse(data);
    }

    public static <T> ServerResponse toFailed(String msg){
        return new ServerResponse(msg);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @JsonIgnore
    public boolean isSuccess(){
        if(this.code.equals(200)){
            return true;
        }
        return false;
    }
}

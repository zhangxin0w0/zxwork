package com.bcs.common;

/**
 * ClassName: ServerResponse
 * 日期: 2020/8/13 15:24
 *
 * @author Air张
 * @since JDK 1.8
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
//序列化json时，时null的对象，key也会消失
public class ServerResponse<T> implements Serializable {
    private Integer status;
    private T data;
    private String msg;


    private ServerResponse(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(Integer status, T data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    private ServerResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }


    public static <T> ServerResponse successRS(String msg) {
        return new ServerResponse(ConstResponse.SUCESS, msg);
    }
    public static <T> ServerResponse successRS(T data) {
        return new ServerResponse(ConstResponse.SUCESS, data);
    }
    //    成功的时候传入状态码、数据、信息
    public static <T> ServerResponse successRS(Integer status, T data, String msg) {
        return new ServerResponse(status, data, msg);
    }

    public static <T> ServerResponse defeatedRS(Integer errorCode, String errorMessage) {
        return new ServerResponse(errorCode, errorMessage);
    }

    public static <T> ServerResponse defeatedRS(String errorMessage) {
        return new ServerResponse(ConstResponse.ERROR, errorMessage);
    }

    @JsonIgnore
//让success不在json序列化结果之中
    public boolean isSuccess() {
        return this.status.equals(ConstResponse.SUCESS);
    }

}
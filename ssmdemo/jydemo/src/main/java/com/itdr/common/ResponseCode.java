package com.itdr.common;

/**
 * ClassName: ResponseCode
 * 日期: 2019/11/25 14:41
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ResponseCode<T> {
    private T data;
    private Integer status;
    private String msg;

    public void setData(T data) {
        this.data = data;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    //创建一些构造方法
    private ResponseCode(){

    }
    private ResponseCode(T data){
        this.data = data;
        this.status = 200;
    }
    private ResponseCode(T data,Integer status){
        this.data = data;
        this.status = status;
    }
    private ResponseCode(T data,Integer status,String msg){
        this.data = data;
        this.status = status;
        this.msg = msg;
    }
    private ResponseCode(String msg){
        this.status = 100;
        this.msg = msg;
    }
    private ResponseCode(Integer status,String msg){
        this.status = status;
        this.msg = msg;
    }

    //创建成功和失败的返回数据的方法
    public static <T> ResponseCode toSuccess(T data){
        return new ResponseCode(data);
    }
    public static <T> ResponseCode toSuccess(T data,Integer status){
        return new ResponseCode(data,status);
    }
    public static <T> ResponseCode toSuccess(T data,Integer status,String msg){
        return new ResponseCode(data,status,msg);
    }


    public static <T> ResponseCode toFail(String msg){
        return new ResponseCode(msg);
    }
    public static <T> ResponseCode toFail(Integer status,String msg){
        return new ResponseCode(status,msg);
    }

}

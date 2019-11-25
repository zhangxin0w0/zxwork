package com.itdr.basic4.demo1;

/**
 * ClassName: Users
 * 日期: 2019/11/22 14:02
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Users {
    private String userName;
    private String passWord;

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }


    public String getPassWord(){
        return this.passWord;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public String show(){
        String s = "userName："+this.userName+"passWord："+this.passWord;
        return s;
    }
}

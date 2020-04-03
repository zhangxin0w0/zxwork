package com.itdr.pojo;

import java.util.List;

/**
 * ClassName: Users
 * 日期: 2020/3/26 18:52
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Users {
//    用户名
    private String userName;
//    密码
    private Integer passWord;
//    存储角色的集合
    private List<JueSe> jueSeList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    public List<JueSe> getJueSeList() {
        return jueSeList;
    }

    public void setJueSeList(List<JueSe> jueSeList) {
        this.jueSeList = jueSeList;
    }
}

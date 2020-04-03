package com.itdr.pojo;

import java.util.List;

/**
 * ClassName: JueSe
 * 日期: 2020/3/26 18:55
 *
 * @author Air张
 * @since JDK 1.8
 */
public class JueSe {
//    职业
    private String profession;
//    性别
    private Integer sex;
//    昵称
    private String nickName;
//    道具包裹
    private List<Goods> goodsList;
//    等级
    private int grade;
//    经验值
    private int exe;
//    金币
    private int money;

    public void lvUp(){
        if(exe >= 100){
            this.grade = exe/100;
        }
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getExe() {
        return exe;
    }

    public void setExe(int exe) {
        this.exe = exe;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

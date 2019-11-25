package com.itdr.games.runeland.pojo;

/**
 * ClassName: OrangeRune
 * 日期: 2019/11/22 15:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class OrangeRune extends Epigraph {
    private int adHurt; //物理攻击力
    private int apHurt; //法术攻击力
    private String adSpeed; //攻速

    public int b = 10;


    public OrangeRune() {

    }

    public OrangeRune(String s) {

        System.out.println("这是子类的有参构造");
    }


    public void showOrange() {
        int a = 1;
        System.out.println("这是橙色子类的方法" + a);
    }

    private void showOrange2() {
        System.out.println("这是橙子类的私有方法");
    }

    public int getAdHurt() {
        return adHurt;
    }

    public void setAdHurt(int adHurt) {
        this.adHurt = adHurt;
    }

    public int getApHurt() {
        return apHurt;
    }

    public void setApHurt(int apHurt) {
        this.apHurt = apHurt;
    }

    public String getAdSpeed() {
        return adSpeed;
    }

    public void setAdSpeed(String adSpeed) {
        this.adSpeed = adSpeed;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

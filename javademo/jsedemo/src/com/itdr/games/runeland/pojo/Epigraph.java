package com.itdr.games.runeland.pojo;

/**
 * ClassName: Epigraph 铭文类
 * 日期: 2019/11/22 15:46
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Epigraph {
    protected String ename;
    protected String color;
    protected int level;
    protected String category;

    public int a = 100;

    private void show() {
        System.out.println("这是父类的方法");
    }

    public  void showOrange(){
        System.out.println("这是父类方法");
    }

    public Epigraph(){

    }
}

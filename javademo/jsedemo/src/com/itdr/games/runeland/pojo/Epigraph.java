package com.itdr.games.runeland.pojo;

/**
 * ClassName: Epigraph 铭文类
 * 日期: 2019/11/22 15:46
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Epigraph{
    public String ename;
    public String color;
    public int level;
    public String category;

    public Epigraph(){

    }

    public void show(){
        System.out.println("ename:"+ename);
    }

    public static void ss(){
        System.out.println("父类的静态方法");
    }
}

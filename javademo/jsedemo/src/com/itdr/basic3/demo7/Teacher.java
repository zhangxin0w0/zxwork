package com.itdr.basic3.demo7;

/**
 * ClassName: Teacher
 * 日期: 2019/11/22 11:30
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Teacher {
    //成员变量
    String tname;

    final int NUM = 10;


    static{
        System.out.println("这是一个静态代码块");
    }
    static int count;
    public static void sleep(){
        System.out.println("老师要睡觉");
    }

    //成员方法
    public void eat(){
        System.out.println("老师要吃饭");
    }


    //构造方法
    public Teacher(){
        System.out.println("这是老师类的无参构造方法");
    }
    public Teacher(String mz,int num){
        System.out.println("这是老师类的有参构造方法");
    }

    //代码块
    {
        System.out.println("这是一个普通代码块");
    }

}

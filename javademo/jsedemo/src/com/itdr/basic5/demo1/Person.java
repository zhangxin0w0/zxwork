package com.itdr.basic5.demo1;

/**
 * ClassName: Person
 * 日期: 2019/11/27 13:46
 *
 * @author Air张
 * @since JDK 1.8
 */
public abstract class Person {
    public String name = "fu";
    public final int A = 1;
    private double b;

    public  Person() {
        System.out.println("这是抽象类的构造方法");
    }

    public abstract void playGame();

    public  void show() {
        System.out.println("这是父类的普通方法");
    }

}

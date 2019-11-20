package com.itdr.basic3.demo4;

/**
 * ClassName: Student
 * 日期: 2019/11/20 14:13
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Student {
    //成员变量
    public String sname; //引用数据类型成员变量
    protected int[] arr; //引用数据类型成员变量

    int sh;
    private double price;
    boolean bol;
    char bj;

    //成员方法
    //构造方法
    //代码块

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.sname);
        System.out.println(s.arr);
        System.out.println(s.sh);
        System.out.println(s.price);
        System.out.println(s.bol);
        System.out.println(s.bj);
    }

}

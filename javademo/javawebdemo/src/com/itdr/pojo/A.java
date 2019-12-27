package com.itdr.pojo;

/**
 * ClassName: A
 * 日期: 2019/12/27 11:06
 *
 * @author Air张
 * @since JDK 1.8
 */
public class A {

    private Integer m;
    private String s;



    public void setM(Integer m) {
        this.m = m;
    }


    public void setS(String s) {
        this.s = s;
    }

    public A() {
        System.out.println("这是A类的无参构造");
    }

//    public A(String sa) {
//        this.s = sa;
//    }

    private A(Integer n) {
        this.m = n;
    }

    public void show(){
        System.out.println("这是A类的普通方法");
    }

    private void noShow(){
        System.out.println("这是A类的私有方法");
    }

    @Override
    public String toString() {
        return "A{" +
                "m=" + m +
                ", s='" + s + '\'' +
                '}';
    }
}

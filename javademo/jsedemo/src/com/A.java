package com;

/**
 * ClassName: A
 * 日期: 2020/1/2 19:00
 *
 * @author Air张
 * @since JDK 1.8
 */
public class A {

    public void show() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    public void show2(){
        throw new NullPointerException();
    }
}

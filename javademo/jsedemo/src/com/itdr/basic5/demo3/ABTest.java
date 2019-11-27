package com.itdr.basic5.demo3;

import javax.xml.transform.Source;

/**
 * ClassName: ABTest
 * 日期: 2019/11/27 18:58
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ABTest {
    public static void main(String[] args) {
        A a = new A();
        a.a = 100;
        a.b = 200;

        B b = new B();
        b.a = 150;
        b.b = 130;

        System.out.println("物理攻击力："+(a.a+b.a));
    }
}

package com.itdr.basic5.demo1;

/**
 * ClassName: PersonTest
 * 日期: 2019/11/27 13:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class PersonTest {
    public static void main(String[] args) {
//        Person p = new Person();
        Person p = new Student();
        p.show();
        System.out.println(p.name);
    }
}

package com.itdr.basic2.demo2;

import java.sql.SQLOutput;

/**
 * ClassName: TestDemo8
 * 日期: 2019/11/13 16:11
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo8 {
    public static void main(String[] args) {
//        int a = (3 > 4) ? 3 : 4;
//        System.out.println(a);

        int a = 1;
        int b = 1;

        int c = (a++ >b++)?++a:--b;
        System.out.println(a);//2
        System.out.println(b);//1
        System.out.println(c);//1

        c = (a>b)?((a++>--b)?a:b):b;
        System.out.println(a);//3
        System.out.println(b);//0
        System.out.println(c);//3

    }

}
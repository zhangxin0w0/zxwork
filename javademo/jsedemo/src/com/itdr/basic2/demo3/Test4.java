package com.itdr.basic2.demo3;

/**
 * ClassName: Test4
 * 日期: 2019/11/14 11:04
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test4 {
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

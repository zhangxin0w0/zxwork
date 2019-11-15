package com.itdr.basic2.demo3;

/**
 * ClassName: Test7
 * 日期: 2019/11/14 11:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test7 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println( a>c && b>c);
        System.out.println( a>c && b<c);
        System.out.println( a<c && b>c);
        System.out.println( a<c && b<c);

        System.out.println( true && false);
        System.out.println( true && true);
        System.out.println( false && true);
        System.out.println( false && false);
    }
}

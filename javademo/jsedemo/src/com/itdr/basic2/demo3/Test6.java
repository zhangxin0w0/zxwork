package com.itdr.basic2.demo3;

/**
 * ClassName: Test6
 * 日期: 2019/11/14 11:21
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test6 {
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        System.out.println(a==b);
        System.out.println(a=b);

        int x = 10;
        int y = 10;
        boolean flag = (x == y);
//        boolean flag2 = (x = y);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (b1 == b2);
        boolean b4 = (b1 = b2);
    }
}

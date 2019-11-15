package com.itdr.basic2.demo2;

/**
 * ClassName: TestDemo6
 * 日期: 2019/11/13 15:40
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo6 {
    public static void main(String[] args){
        int a = 1;
        int b = 1;

        System.out.println(a++);//a=1
        System.out.println(--b);//a=2,b=0

        //System.out.println(a++ & b++);//这是位运算符
        System.out.println(a++ >0 | b++ <0);//a=3,b=1,true

        System.out.println(a++ >b && b-- <a);//a=4,b=0,true
        System.out.println(a-- >1 || b++ <0);//a=3,b=0,true

        System.out.println(--b > a ^ b <a);//a=3,b=-1,true
        System.out.println(! (--b+a <0) );//a=3,b=-2,true

    }
}

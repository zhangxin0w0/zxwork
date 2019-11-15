package com.itdr.basic2.demo2;

/**
 * ClassName: TestDemo5
 * 日期: 2019/11/13 15:33
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo5 {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        System.out.println(a & b);//false
        System.out.println(a | b);//true
        System.out.println(false ^ false);//true
        System.out.println(! a);//false
        System.out.println(! b);//true
        System.out.println(a && b);//false
        System.out.println(a || b);//true
    }
}

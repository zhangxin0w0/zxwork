package com.itdr.basic2.demo2;

/**
 * ClassName: TestDemo3
 * 日期: 2019/11/13 15:16
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo3 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = a+b;

//        c+=a;
//        c-=a;
//        c*=a;
//        c/=a;
        c%=a;
        System.out.println(c);

    }
}

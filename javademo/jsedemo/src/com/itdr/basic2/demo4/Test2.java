package com.itdr.basic2.demo4;

/**
 * ClassName: Test2
 * 日期: 2019/11/14 14:07
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test2 {
    public static void main(String[] args){
//        计算1+2+3...+10的和
        int a = 1;
        int s = 0;
        for(a=1;a<=10;a++){
            s=s+a;
        }
        System.out.println(s);
    }
}

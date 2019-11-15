package com.itdr.basic2.demo5;

/**
 * ClassName: Test2
 * 日期: 2019/11/15 10:36
 *
 * @author Air张
 * @since JDK 1.8
 */

import javax.xml.transform.Source;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i >= 1; ) {
//            System.out.println("请输入一个数字：");
//            i = sc.nextInt();
//            System.out.println("你输入的数字是："+i);
//            System.out.println("你还要继续输入数字码？");
//            System.out.println("输入1代表继续");
//            System.out.println("输入0代表不继续");
//        }

        int m = 0;
        int n = 1;
        while(n==1){
            System.out.println("-------------------");
            System.out.println("请输入一个数字：");
            m = sc.nextInt();
            System.out.println("你输入的数字是："+m);
            System.out.println("你还要继续输入数字吗？");
            System.out.println("输入1代表继续");
            System.out.println("输入0代表不继续");
            System.out.println("请输入一个数字：");
            n = sc.nextInt();
        }
    }
}

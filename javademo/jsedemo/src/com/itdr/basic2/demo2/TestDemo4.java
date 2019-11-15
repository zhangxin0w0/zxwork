package com.itdr.basic2.demo2;

/**
 * ClassName: TestDemo4
 * 日期: 2019/11/13 15:21
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class TestDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}

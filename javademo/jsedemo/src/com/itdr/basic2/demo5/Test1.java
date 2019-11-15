package com.itdr.basic2.demo5;

/**
 * ClassName: Test1
 * 日期: 2019/11/15 10:30
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
//        判断输入数字的是奇数还是偶数
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("请输入一个数字：");
        int m = sc.nextInt();

        if(m%2 == 0){
            System.out.println("这是一个偶数");
        }else{
            System.out.println("这是一个奇数");
        }
    }
}

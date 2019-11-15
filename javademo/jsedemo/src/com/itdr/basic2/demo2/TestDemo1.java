package com.itdr.basic2.demo2;

/**
 * ClassName: TestDemo1
 * 日期: 2019/11/13 14:49
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class TestDemo1 {
    public static void main(String[] args){
        //用户输入两个数字，求两个数字的和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int y = sc.nextInt();

        int z = x+y;
        System.out.println("两个数字的和是："+z);
        z = x-y;
        System.out.println("两个数字的差是："+z);
        z = x*y;
        System.out.println("两个数字相乘是："+z);
        z = x/y;
        System.out.println("两个数字相除是："+z);
        z = x%y;
        System.out.println("两个数字取模是："+z);
    }
}

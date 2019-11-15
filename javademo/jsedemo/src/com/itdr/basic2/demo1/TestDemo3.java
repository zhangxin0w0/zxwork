package com.itdr.basic2.demo1;

/**
 * ClassName: TestDemo3
 * 日期: 2019/11/13 14:00
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args){
        //用户输入长方形的宽和高，然后输出长方形面积
        //1.从控制台获取用户输入的内容
        Scanner sss = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        int x = sss.nextInt();
        System.out.println("请输入长方形的宽：");
        int y = sss.nextInt();

        int s = x*y;
        System.out.print("长方形的面积是：");
        System.out.println(s);
    }
}

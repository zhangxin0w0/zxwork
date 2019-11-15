package com.itdr.basic2.demo4;

/**
 * ClassName: Test5
 * 日期: 2019/11/14 14:50
 *
 * @author Air张
 * @since JDK 1.8
 */

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        判断输入的数字是星期几
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int m = sc.nextInt();

        //判断用户输入的内容
        //1.如果用户输入的是1~7之间的数字，就输出对应的星期
        //2.否则就输出，输入的数字有误

//        if(m>0 && m<8){
//            System.out.println("今天是星期"+m);
//        }
//        if(m<=0 || m>7){
//            System.out.println("输入的数字有误");
//        }

        if(m == 1){
            System.out.println("今天是星期一");
        }
        if(m == 2){
            System.out.println("今天是星期二");
        }
        if(m == 3){
            System.out.println("今天是星期三");
        }
        if(m == 4){
            System.out.println("今天是星期四");
        }
        if(m == 5){
            System.out.println("今天是星期五");
        }
        if(m == 6){
            System.out.println("今天是星期六");
        }
        if(m == 7){
            System.out.println("今天是星期日");
        }
        if(m<=0 || m>7){
            System.out.println("输入的数字有误");
        }
    }
}

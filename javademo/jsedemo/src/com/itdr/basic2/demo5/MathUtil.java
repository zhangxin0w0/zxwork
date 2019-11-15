package com.itdr.basic2.demo5;

/**
 * ClassName: MathUtil
 * 日期: 2019/11/15 11:17
 *
 * @author Air张
 * @since JDK 1.8
 */

import java.util.Scanner;

public class MathUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

//        pds(m);
//       jia(1,2);
        int a = getNum(m);
        if(a == -1){
            System.out.println("不能计算出这样的和");
        }else{
            System.out.println("当累加到"+a+"的时候和为");
        }
    }

    //    这是一个判断数字是否为素数的方法
    public static void pds(int a) {
        if (a == 1 || a == 2) {
            System.out.println("这是一个素数");
        } else {
            int num = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    num++;
                }
            }
            if (num == 2) {
                System.out.println("这是一个素数");
            } else {
                System.out.println("这不是一个素数");
            }
        }
    }

    //计算两个数字的加、减、乘、除、取模
    public static int jia(int a, int b) {
        int m = a + b;
        return m;
    }

    //计算从1+2+3...+100，加到几时和为666
    public static int getNum(int a){
        int s = 0;
        for(int i =1;i<101;i++){
            s = s+i;
            if(s == a){
                return i;
            }
        }
        return -1;
    }
}

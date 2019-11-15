package com.itdr.basic2.demo5;

/**
 * ClassName: Test3
 * 日期: 2019/11/15 10:50
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
//        判断输入的自然数是否为质数
//        质数就是只能被1和自身整除的数

        //1.整除说明余数为0
        //2.一个数字对从1到自身的整数做除法，如果只有1和自身能整除，就是素数

        Scanner sc = new Scanner(System.in);

        int m = 1;
        while (m == 1){
            System.out.println("-----------");
            System.out.println("欢迎使用素数判断小程序");
            System.out.println("请输入要判断的数字：");
            int a = sc.nextInt();
            if (a == 1 || a == 2) {
                System.out.println("这是一个素数");
            }else{
                int num = 0;
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0) {
                        num++;
                    }
                }
                if (num == 2) {
                    System.out.println("这是一个素数");
                }else{
                    System.out.println("这不是一个素数");
                }
            }
            System.out.println("--------------");
            System.out.println("还要继续判断吗？1继续/0不继续");
            m = sc.nextInt();
        }


    }
}

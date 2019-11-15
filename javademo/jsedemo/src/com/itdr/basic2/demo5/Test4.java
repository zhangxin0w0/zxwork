package com.itdr.basic2.demo5;

/**
 * ClassName: Test4
 * 日期: 2019/11/15 11:15
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int m = sc.nextInt();

        int s = MathUtil.jia(i,m);
        System.out.println(s);
    }
}

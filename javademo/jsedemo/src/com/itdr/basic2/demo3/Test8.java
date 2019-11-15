package com.itdr.basic2.demo3;

/**
 * ClassName: Test8
 * 日期: 2019/11/14 11:40
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args){
        Scanner test8 = new Scanner(System.in);
        int x,y;
        x = test8.nextInt();
        y = test8.nextInt();


        int a = (x>y)?x:y;
        System.out.println(a);

        int c = test8.nextInt();
        int m = (c>a)?c:a;
    }
}

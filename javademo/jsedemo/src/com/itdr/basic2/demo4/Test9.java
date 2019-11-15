package com.itdr.basic2.demo4;

/**
 * ClassName: Test9
 * 日期: 2019/11/14 15:29
 *
 * @author Air张
 * @since JDK 1.8
 */

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*判断输入的成绩等级
        （	90=<A<=100	80=<B<90	  70=<C<80	60=<D<70 	  其它E）
        分别用if语句和switch语句完成*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int m = sc.nextInt();

        if(m<0 || m>100){
            System.out.println("你输入的成绩有误");
            //如果在这里程序就可以结束掉就好了
            return;
        }

        switch (m / 10) {
            case 10:
                System.out.println("A");
//                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}

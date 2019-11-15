package com.itdr.basic2.demo4;

/**
 * ClassName: Test8
 * 日期: 2019/11/14 15:19
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        /*判断输入的成绩等级
        （	90=<A<=100	80=<B<90	  70=<C<80	60=<D<70 	  其它E）
        分别用if语句和switch语句完成*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int m = sc.nextInt();

        if(m>=90 && m<=100){
            System.out.println("你的成绩是：A");
        }else if(m<90 && m>=80){
            System.out.println("你的成绩是：B");
        }else if(m<80 && m>=70){
            System.out.println("你的成绩是：C");
        }else if(m<70 && m>=60){
            System.out.println("你的成绩是：D");
        }else if(m<60 && m>=0){
            System.out.println("你的成绩是：E");
        }else{
            System.out.println("你的成绩无效！");
        }
    }
}

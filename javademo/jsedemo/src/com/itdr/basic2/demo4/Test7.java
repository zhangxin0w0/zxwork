package com.itdr.basic2.demo4;

/**
 * ClassName: Test7
 * 日期: 2019/11/14 15:12
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
//        判断输入的月份是什么季节 1~12
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字月份：");
        int m = sc.nextInt();

        //春天 3,4,5
        //夏天 6,7,8
        //秋天 9,10,11
        //冬天 12,1,2
        if (m == 3 || m == 4 || m == 5) {
            System.out.println("现在是春天~");
        }else if (m == 6 || m == 7 || m == 8) {
            System.out.println("现在是夏天！");
        }else if (m == 9 || m == 10 || m == 11) {
            System.out.println("现在是秋天~");
        }else if (m == 12 || m == 1 || m == 2) {
            System.out.println("现在是冬天！");
        } else{
            System.out.println("输入的月份有误");
        }
    }
}

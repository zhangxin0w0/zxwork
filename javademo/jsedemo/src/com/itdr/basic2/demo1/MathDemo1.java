package com.itdr.basic2.demo1;

/**
 * ClassName: MathDemo1
 * 日期: 2019/11/13 11:18
 *
 * @author Air张
 * @since JDK 1.8
 */
public class MathDemo1 {
    public static void main(String[] args){
        /*A=900
        B=1250
        甲=24
        乙=30
        丙=32
        设：一共植树x天，乙在A地植树y天
        24x+30y=900
        32x+30(x-y)=1250
        32x+30x-30y=1250
        62x-30y=1250*/

        int a = 900;
        int b = 1250;
        int jia = 24;
        int yi = 30;
        int bing = 32;

//        甲单独种A地，几天种完？
        int x = 900/24;
//        double y = 900/24;

        System.out.println(x);
//        System.out.println(y);
    }
}

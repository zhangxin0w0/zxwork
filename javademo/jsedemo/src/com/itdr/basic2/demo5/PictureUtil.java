package com.itdr.basic2.demo5;

/**
 * ClassName: PictureUtil
 * 日期: 2019/11/15 14:09
 *
 * @author Air张
 * @since JDK 1.8
 */

import java.util.Scanner;

public class PictureUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行：");
        int h = sc.nextInt();
        System.out.println("请输入列：");
        int l = sc.nextInt();

//        outPutRct(h, l);
        outPutRct2(h, l);
    }

    //打印矩形
    public static void outPutRct(int c, int k) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //打印平行四边形
    public static void outPutRct2(int c, int k) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {

                //第一行
                if (i == 0) {
                    if (j == 0 || j == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }

                //第二行
                if (i == 1) {
                    if (j == 0 || j == 6) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }

                //第三行
                if (i == 2) {
                    if (j == 5 || j == 6) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }

            }
            System.out.println();
        }
    }

    public static void pxsb(int m,int n) {
        for (int i=0;i<m;i++) {
            for (int j=1; j<=(n-i);j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=(m+1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

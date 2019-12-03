package com.itdr.basic7;

/**
 * ClassName: ScannerTest
 * 日期: 2019/12/3 9:43
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        //获取用户输入的数据，直到用户不输入为止，输出所有输入的数字
        Scanner sc = new Scanner(System.in);
//        int[] a = new int[100];
//
//        System.out.println("请输入一个数字：");
//        while (sc.hasNextInt()){
//            System.out.println("请输入一个数字：");
//            int i = sc.nextInt();
//            for (int j = 0; j < a.length; j++) {
//                if(a[j] == 0){
//                    a[j] = i;
//                    break;
//                }
//            }
//        }
//
//        for (int j = 0; j < a.length; j++) {
//            if(a[j] != 0){
//                System.out.println(a[j]);
//            }
//        }

        String[] ss = ss(sc);

    }

    //获取用户输入的任意数据，直到不输入为止，输出用户输入的内容
    public static String[] ss(Scanner sc){
        String[] s = new String[10];
        System.out.println("请输入内容：");
        String next = "";
        while (!next.equals("bye")){
            System.out.println("请输入内容：");
            next = sc.next();
            for (int i = 0; i < s.length; i++) {
                if(s[i] == null){
                    s[i] = next;
                    break;
                }
            }
        }

        return s;
    }
}

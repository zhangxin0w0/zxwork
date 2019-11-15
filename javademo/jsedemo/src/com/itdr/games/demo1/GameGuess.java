package com.itdr.games.demo1;

/**
 * ClassName: GameGuess
 * 日期: 2019/11/15 15:30
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class GameGuess {
    public static void main(String[] args) {
        //创建一个数组，用来保存用户信息
        int[] arr = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册的用户名：");
        int um = sc.nextInt();


        int i = register(um,arr);
        if(i == 1){
            System.out.println("用户注册成功！");
        }else {
            System.out.println("用户注册失败！");
        }

        System.out.println("-------------");
    }

    //    1.用户注册
    public static int register(int uname,int[] arr) {
        //判断传来的数据是否合法
        if (uname <= 0){
            return -1;
        }

        //判断用户名是否存在
        for(int i = 0;i<arr.length;i++){
            //跟存在的用户比较
            if(arr[i] != 0){
                if(uname == arr[i]){
                    return -1;
                }
            }else{
                //注册成功把数据保存起来
                arr[i] = uname;
                break;
            }
        }
        return 1;
    }

//2.用户登录
//3.用户注销
//4.查看排行榜==获取分数最高的前10个用户信息==获取用户信息
//5.进入游戏
//1）用户选择出拳
//2）电脑随机出拳
//3）用户和电脑出拳相比较
//4）用户分数更新
//5）是否继续游戏
}

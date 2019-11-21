package com.itdr.games.demo3;

/**
 * ClassName: LJTest
 * 日期: 2019/11/21 19:02
 *
 * @author Air张
 * @since JDK 1.8
 */
public class LJTest {
    //用来存放用户
    static Users[] users = new Users[1000];
    //用来存放门派和该门派对应的人数
//    static String[][] mps = new String[100][1];

    //第二种方案，只允许5个门派进入，创建一个门派数组，来保存门派
    static String[] mps2 = new String[5];
    static int[] mpnum = new int[5];
    static {
        mps2[0] = "java";
    }



    //灵境主入口
    public static void main(String[] args) {
        //灵境初始化


       /* int i = pdAge(new Users("1","2","3",4));
        System.out.println(i);*/

        //记录进入的人
        Users us = new Users("1","java","3",4);
        int i2 = saveUsers(us,users);
        System.out.println(i2);

        //判断进入人所在门派人数是否超过10
        for(int i = 0;i<12;i++){
            int n = pdMPNum(us,mps2,mpnum);
            System.out.println(n);
        }

    }

    //判断进入灵境之人的年龄是否符合
    public static int pdAge(Users u){
        //有没有这个人？
        if(u != null){
            if(u.age>=10 && u.age<=30){
                return 1;
            }
        }
        //不合格
        return -1;
    }

    //记录每一个进入的人
    public static int saveUsers(Users u,Users[] uar){
        //判断该用户是否存在
        for(int i = 0;i<uar.length;i++){
            if(uar[i] != null){
                if(uar[i].uname.equals(u.uname)){
                    return -1;
                }
            }
        }
        //如果不存在就记录下来
        for(int i = 0;i<uar.length;i++){
            if(uar[i] == null){
                uar[i] = u;
                return 1;
            }
        }
        return -1;
    }

    //判断进入人所在门派人数是否超过10
    public static int pdMPNum(Users u,String[] mp,int[] mpnum){
        if(u != null){
            for(int i = 0;i<mp.length;i++){
                if(mp[i] !=null && mp[i].equals(u.mp)){
                    if(mpnum[i] <10){
                        mpnum[i]++;
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
}

package com.itdr.anli;

import com.itdr.utils.ITDRPageUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: SceneDemo
 * 日期: 2020/3/26 19:03
 *
 * @author Air张
 * @since JDK 1.8
 */
public class SceneDemo {
    // 存储用户仓库
    private static List<Users> usersList = new ArrayList<Users>();
    // 存储职业仓库
    private static String[] professionList = {"无","战士", "法师", "牧师"};
    // 存储性别仓库
    private static String[] sexList = {"无","男", "女"};

    //    程序主入口
    public static void main(String[] args) {
        // 键盘录入数据
        Scanner sc = new Scanner(System.in);
        // 保存登录用户数据
        Users users = null;
        // 存储角色仓库
        ArrayList<JueSe> jueSeArrayList = new ArrayList<JueSe>();

        // 功能控制
        int num = 0;
        while (num != 9) {
            // 场景首页：1.用户注册 2.用户登录
            ITDRPageUtil.home();
            num = sc.nextInt();
            switch (num) {
                // 用户页面：1.用户注册  用户注册成功跳回首页
                case 1:
                    System.out.println("请输入用户名：");
                    String userName = sc.next();

                    System.out.println("请输入密码：");
                    Integer passWord = sc.nextInt();

                    //存储用户
                    Users u = getUsers(userName, passWord);
                    usersList.add(u);
                    break;

                // 登录页面：1.用户登录  用户登录成功跳到角色页面
                case 2:
                    System.out.println("请输入用户名：");
                    String userName2 = sc.next();

                    System.out.println("请输入密码：");
                    Integer passWord2 = sc.nextInt();
                    // 用户登录
                    users = login(userName2, passWord2, usersList);
                    users.setJueSeList(jueSeArrayList);
                    // 登录成功跳到角色页面
                    if (users != null) {
                        // 角色页面：1.创建角色 2.查看角色
                        int num2 = 0;
                        while (num2 != 9) {
                            ITDRPageUtil.createJueSe();
                            num2 = sc.nextInt();
                            switch (num2) {
                                // 创建角色,用户创建角色成功后跳回角色界面可以查看角色
                                case 1:
                                    System.out.println("请选择职业：1.战士 2.法师 3.牧师");
                                    int i = sc.nextInt();
                                    System.out.println("请选择性别：1.男 2.女");
                                    int i2 = sc.nextInt();
                                    System.out.println("请输入昵称：");
                                    String nickName = sc.next();
                                    JueSe jueSe = getJueSe(professionList[i], i2, nickName);
                                    // 把创建的角色放入当前登录的用户账户内
                                    jueSeArrayList.add(jueSe);
                                    break;

                                // 查看角色
                                case 2:
                                    List<JueSe> jueSeList = getJuSeList(users);
                                    // 用户查看角色，如果角色列表为空，直接跳回角色页面，如果有角色，就展示角色信息
                                    if (jueSeList.size() > 0) {
                                       ITDRPageUtil.jueSeList(jueSeList,sexList);
                                       sc.next();
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }

        }


    }

    //注册用户
    public static Users getUsers(String userName, Integer passWord) {
        //创建一个用户
        Users u = new Users();
        u.setUserName(userName);
        u.setPassWord(passWord);

        return u;
    }

    // 用户登录
    public static Users login(String userName, Integer passWord, List<Users> usersList) {
        for (Users u : usersList) {
            if (u.getUserName().equals(userName) && u.getPassWord().equals(passWord)) {
                return u;
            }
        }

        return null;
    }

    // 角色创建
    public static JueSe getJueSe(String profession, Integer sex, String nickName) {
        // 创建一个角色
        JueSe jueSe = new JueSe();
        jueSe.setProfession(profession);
        jueSe.setSex(sex);
        jueSe.setNickName(nickName);
        // 初始化等级为1
        jueSe.setGrade(1);
        // 初始化经验值为0
        jueSe.setExe(0);
        // 初始化金币为0
        jueSe.setMoney(0);
        return jueSe;
    }

    // 查看当前登录用户的角色
    public static List<JueSe> getJuSeList(Users u) {
        return u.getJueSeList();
    }

}

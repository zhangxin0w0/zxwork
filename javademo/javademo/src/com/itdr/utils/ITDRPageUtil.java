package com.itdr.utils;

import com.itdr.anli.JueSe;

import java.util.List;

/**
 * ClassName: ITDRPageUtil
 * 日期: 2020/3/27 15:45
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ITDRPageUtil {
    // 页头
    private static void top(){
        System.out.println("===欢迎来到异世界===");
    }
    // 页尾
    private static void bottom(){
        System.out.println("===输入数字选择功能，输入9离开这里===");
    }

    // 首页
    public static void home(){
        top();
        System.out.println("1.用户注册");
        System.out.println("2.用户登录");
        bottom();
    }

    // 角色页面
    public static void createJueSe(){
        top();
        System.out.println("1.角色创建");
        System.out.println("2.角色查看");
        bottom();
    }

    // 角色列表页面
    public static void jueSeList(List<JueSe> jueSeList,String[] sexList){
        top();
        for (int j = 0; j < jueSeList.size(); j++) {
            System.out.println("角色序号：" + (j+1));
            System.out.println("角色职业：" + jueSeList.get(j).getProfession());
            System.out.println("角色性别：" + sexList[jueSeList.get(j).getSex()]);
            System.out.println("角色昵称：" + jueSeList.get(j).getNickName());
            System.out.println("角色等级：" + jueSeList.get(j).getGrade());
            System.out.println("角色经验值：" + jueSeList.get(j).getExe());
            System.out.println("角色金币：" + jueSeList.get(j).getMoney());
        }
        System.out.println("===按任意键返回上一页===");
    }
}

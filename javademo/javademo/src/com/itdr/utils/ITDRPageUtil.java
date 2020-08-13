package com.itdr.utils;

import com.itdr.pojo.Copys;
import com.itdr.pojo.Goods;
import com.itdr.pojo.JueSe;

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
        System.out.println("3.角色选择");
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
            if(jueSeList.get(j).getGoodsList().size() >0){
                System.out.println("角色道具：");
                for (Goods goods : jueSeList.get(j).getGoodsList()) {
                    System.out.print(goods.getGname()+",");
                }
            }else {
                System.out.println("角色道具：[空]");
            }
            System.out.println("光明信仰值："+jueSeList.get(j).getLightBeliefValue());
            System.out.println("黑暗信仰值："+jueSeList.get(j).getDarkBeliefValue());
            System.out.println("阵营所属："+jueSeList.get(j).getCamp());
        }
        System.out.println("===按任意键返回上一页===");
    }

    // 选择角色页面
    public static void jueSeList2(List<JueSe> jueSeList,String[] sexList){
        top();
        if(jueSeList.size() > 0){
            for (int j = 0; j < jueSeList.size(); j++) {
                System.out.println("角色序号：" + (j+1));
                System.out.println("角色昵称：" + jueSeList.get(j).getNickName());
                System.out.println("角色等级：" + jueSeList.get(j).getGrade());
            }
            System.out.println("===按序号选择使用角色===");
        }else{
            System.out.println("当前账户下没有角色，请返回创建！");
            System.out.println("===按任意键返回上一页===");
        }
    }

    // 选择副本页面（副本列表页）
    public static void fuBenList(List<Copys> copysList){
        top();
        System.out.println("￥￥￥当前可以挑战的副本￥￥￥");
        for (Copys copys : copysList) {
            System.out.println("副本序号："+copys.getId()+"，副本名称："+copys.getCname()+"，副本难度："+copys.getLevel()+"，副本收益："+copys.getMoney());
        }
        System.out.println("===输入数字选择功能，输入0离开这里===");
    }

    // 副本详情页面
    public static void fuBenDetail(){
        top();
        System.out.println("1.开启副本");
        System.out.println("2.使用道具");
        System.out.println("3.随身商店");
        System.out.println("4.返回重新选择副本");
        bottom();
    }

    // 道具列表页
    public static void goodsList(List<Goods> goodsList){
        top();
        if(goodsList.size() > 0) {
            for (Goods goods : goodsList) {
                System.out.println("序号：" + goods.getId() + "，名称：" + goods.getGname() + "，效果：" + goods.getBuff() + "，价格：" + goods.getPrice());
            }
        }else {
            System.out.println("你还没有道具啊！快去买一个！");
        }
        bottom();
    }

    // 商店列表
    public static void storeList(List<Goods> goodsListStart) {
        for (int i = 0; i <3 ; i++) {
            int random = (int) Math.round(Math.random()*9);
            Goods goods = goodsListStart.get(random);
            System.out.println("序号：" + goods.getId() + "，名称：" + goods.getGname() + "，效果：" + goods.getBuff() + "，价格：" + goods.getPrice());
        }
    }

   // 副本收益展示页
    public static void getExeAndMoneyPage(int j){
        System.out.println("===副本挑战结束===");
        System.out.println("获得收益：经验值+"+j*10+"，金币：+"+j*10);
        System.out.println("===按任意键返回城镇===");
    }
}

package com.itdr.anli;

import com.itdr.pojo.Copys;
import com.itdr.pojo.Goods;
import com.itdr.pojo.JueSe;
import com.itdr.pojo.Users;
import com.itdr.utils.ITDRPageUtil;
import com.itdr.utils.PlayContentUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    private static String[] professionList = {"无", "战士", "法师", "牧师"};
    // 存储性别仓库
    private static String[] sexList = {"无", "男", "女"};
    // 存储副本仓库
    private static List<Copys> copysList = new ArrayList<>();

    static {
        Copys c = new Copys(1, "破除迷惘的双眼", 'D', 100, true);
        Copys c2 = new Copys(2, "艰难的抉择", 'D', 100, true);
        Copys c3 = new Copys(3, "神秘的土罐", 'B', 100, true);
        Copys c4 = new Copys(4, "高耸的尖塔", 'C', 100, true);
        copysList.add(c);
        copysList.add(c2);
        copysList.add(c3);
        copysList.add(c4);
    }

    // 存储道具仓库
    private static List<Goods> goodsListStart = new ArrayList<Goods>();

    static {
        Goods g = new Goods(1, "替身稻草人", "复活一次", 100);
        Goods g2 = new Goods(2, "永恒守护", "抵挡一次伤害", 100);
        Goods g3 = new Goods(3, "冰霜长矛", "延长10秒时间", 100);
        Goods g4 = new Goods(4, "中娅沙漏", "暂停10秒时间", 100);
        Goods g5 = new Goods(5, "中娅沙漏2", "暂停10秒时间", 100);
        Goods g6 = new Goods(6, "中娅沙漏3", "暂停10秒时间", 100);
        Goods g7 = new Goods(7, "中娅沙漏4", "暂停10秒时间", 100);
        Goods g8 = new Goods(8, "中娅沙漏5", "暂停10秒时间", 100);
        Goods g9 = new Goods(9, "中娅沙漏6", "暂停10秒时间", 100);
        Goods g10 = new Goods(10, "中娅沙漏7", "暂停10秒时间", 100);
        goodsListStart.add(g);
        goodsListStart.add(g2);
        goodsListStart.add(g3);
        goodsListStart.add(g4);
        goodsListStart.add(g5);
        goodsListStart.add(g6);
        goodsListStart.add(g7);
        goodsListStart.add(g8);
        goodsListStart.add(g9);
        goodsListStart.add(g10);
    }

    //    程序主入口
    public static void main(String[] args) {
        // 键盘录入数据
        Scanner sc = new Scanner(System.in);
        // 保存登录用户数据
        Users users = null;
        // 保存登录用户选择角色数据
        JueSe selectJueSe = null;
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
                        // 角色页面：1.创建角色 2.查看角色 3.选择角色
                        int num2 = 0;
                        while (num2 != 9) {
                            ITDRPageUtil.createJueSe();
                            List<JueSe> jueSeList = getJuSeList(users);
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
                                    // 用户查看角色，如果角色列表为空，直接跳回角色页面，如果有角色，就展示角色信息
                                    if (jueSeList.size() > 0) {
                                        ITDRPageUtil.jueSeList(jueSeList, sexList);
                                        sc.next();
                                    }
                                    break;
                                case 3:
                                    // 用户选择角色，如果为空提示角色不存在，如果不为空，就展示可以选择的角色
                                    ITDRPageUtil.jueSeList2(jueSeList, sexList);
                                    if (jueSeList.size() > 0) {
                                        // 用户选择的角色ID
                                        int jueSeID = sc.nextInt();
                                        // 保存角色数据
                                        selectJueSe = jueSeList.get(jueSeID - 1);
                                        // 选择副本页面
                                        while (true) {
                                            // 副本列表页
                                            ITDRPageUtil.fuBenList(copysList);
                                            // 获取副本序号
                                            int fuBenID = sc.nextInt();
                                            // 用户输入0，回到角色页面
                                            if (fuBenID == 0) {
                                                break;
                                            }

                                            // 当副本开关开启的时候才可以挑战
                                            if (copysList.get(fuBenID - 1).getOnOrOff()) {

                                                // 判断当前选择角色的等级
                                                if (fuBenID == 2 && selectJueSe.getGrade() < 5) {
                                                    System.out.println("当前等级无法挑战该副本！");
                                                    System.out.println("请按任意键返回重新选择副本");
                                                    sc.next();
                                                } else {

                                                    int num3 = 0;
                                                    while (num3 != 9) {
                                                        // 副本详情页
                                                        ITDRPageUtil.fuBenDetail();
                                                        num3 = sc.nextInt();
                                                        switch (num3) {
                                                            case 1:
                                                                // 开始挑战
                                                                switch (fuBenID) {
                                                                    case 1:
                                                                        int j;
                                                                        for (j = 1; j < 5; j++) {
                                                                            Map<String, List<String>> map = PlayContentUtil.play(j);
                                                                            List<String> play = map.get("end");
                                                                            List<String> falseList = map.get("false");

                                                                            System.out.print("做出抉择：[");
                                                                            for (int k = 0; k < play.size(); k++) {
                                                                                if (k != play.size() - 1) {
                                                                                    System.out.print(play.get(k) + ",");
                                                                                } else {
                                                                                    System.out.println(play.get(k) + "]");
                                                                                }
                                                                            }
                                                                            System.out.println("请输入错误数据，以/隔开，按回车结束输入");

                                                                            // 获得用户输入数据
                                                                            String next = sc.next();
                                                                            // 判断是否通过
                                                                            boolean pass = PlayContentUtil.pass(falseList, j, next);

                                                                            // 通关成功之后，怎么计算经验值和金币收益
                                                                            if (!pass || (pass && (j == 4))) {
                                                                                PlayContentUtil.passGetExeAndMoney(j, selectJueSe);
                                                                                break;
                                                                            }

                                                                        }
                                                                        // 副本挑战结束收益结算页
                                                                        ITDRPageUtil.getExeAndMoneyPage(j);
                                                                        sc.next();
                                                                        break;

                                                                    // 艰难的抉择
                                                                    case 2:
                                                                        if (selectJueSe.getCamp().equals("无")) {
                                                                            boolean bol = false;
                                                                            while (!bol) {
                                                                                String s = PlayContentUtil.play2();
                                                                                System.out.println(s);
                                                                                System.out.println("请回答是或否");
                                                                                String next = sc.next();
                                                                                bol = PlayContentUtil.pass2(next, selectJueSe);
                                                                            }
                                                                            copysList.get(1).setOnOrOff(false);
                                                                            // 副本挑战结束收益结算页
                                                                            ITDRPageUtil.getExeAndMoneyPage(1);
                                                                            sc.next();
                                                                        }else{
                                                                            System.out.println("当前副本不可重复挑战！");
                                                                            System.out.println("按任意键返回城镇");
                                                                            sc.next();
                                                                        }
                                                                        break;
                                                                }
                                                                // 每次副本挑战结束，自动结算角色等级
                                                                selectJueSe.autoLvUp();
                                                                break;
                                                            case 2:
                                                                // 使用道具
                                                                // 获取道具列表
                                                                if (selectJueSe.getGoodsList().size() > 0) {
                                                                    ITDRPageUtil.goodsList(selectJueSe.getGoodsList());
                                                                    // 这是选择的道具ID
                                                                    int goodsID = sc.nextInt();
                                                                }
                                                                break;
                                                            case 3:
                                                                // 开启商店
                                                                ITDRPageUtil.storeList(goodsListStart);
                                                                // 这是购买的道具ID
                                                                int goodsID = sc.nextInt();
                                                                // 放到当前角色的包裹里
                                                                if (selectJueSe.getMoney() >= goodsListStart.get(goodsID).getPrice()) {
                                                                    // 扣除道具金币
                                                                    selectJueSe.setMoney(selectJueSe.getMoney() - goodsListStart.get(goodsID).getPrice());
                                                                    // 把买好的道具放到包裹里
                                                                    selectJueSe.getGoodsList().add(goodsListStart.get(goodsID));
                                                                } else {
                                                                    System.out.println("金额不足，无法购买，按任意键返回上一页");
                                                                    sc.next();
                                                                }
                                                                break;
                                                            default:
                                                                num3 = 9;
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("当前选择副本已关闭，无法挑战！");
                                                System.out.println("请按任意键返回重新选择副本");
                                                sc.next();
                                            }
                                        }

                                    } else {
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
        // 存储道具的仓库
        ArrayList<Goods> goodsArrayList = new ArrayList<Goods>();
        // 创建一个角色
        JueSe jueSe = new JueSe();
        jueSe.setProfession(profession);
        jueSe.setSex(sex);
        jueSe.setNickName(nickName);
        // 初始化等级为1
        jueSe.setGrade(5);
        // 初始化经验值为0
        jueSe.setExe(0);
        // 初始化金币为0
        jueSe.setMoney(0);
        // 配置道具包裹
        jueSe.setGoodsList(goodsArrayList);
        // 初始阵营为无
        jueSe.setCamp("无");
        return jueSe;
    }

    // 查看当前登录用户的角色
    public static List<JueSe> getJuSeList(Users u) {
        return u.getJueSeList();
    }

    // 开启副本
    public static void beginFuBen(int fuBenID) {

    }
}

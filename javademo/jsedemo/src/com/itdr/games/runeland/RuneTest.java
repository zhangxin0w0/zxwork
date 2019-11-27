package com.itdr.games.runeland;

import com.itdr.games.runeland.pojo.*;
import com.itdr.games.runeland.utils.SceneUtil;

/**
 * ClassName: RuneTest
 * 日期: 2019/11/22 15:45
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;

public class RuneTest {
    static RuneUser[] runeUsers;
    static Epigraph[] epi;
    static RuneUser ru;

    //程序初始化，准备好存放数据的数组
    static {
        //准备一个用户数组
        runeUsers = new RuneUser[10];
        //准备一个符文数组
        epi = new Epigraph[3];
        OrangeRune o = new OrangeRune();
        o.ename = "橙符文";
        o.category = "攻击";
        o.setAdHurt(130);
        epi[0] = o;

        BlueRune b = new BlueRune();
        b.ename = "蓝符文";
        b.category = "防御";
        b.setMaxLife(100);
        epi[1] = b;

        GreenRune g = new GreenRune();
        g.ename = "绿符文";
        g.category = "冷却";
        g.setCd(0.002);
        epi[2] = g;
    }


    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);


        int m = 0;
        int nu = 0;
        while (m != 9) {
            //进入首页，判断当前有没有用户
            SceneUtil.home(ru);
            m = sc.nextInt();

            //选择功能
            bj:switch (m) {
                case 1:
                    System.out.println("请输入用户名：");
                    String name = sc.next();
                    System.out.println("请输入密码：");
                    String psd = sc.next();
                    //用户登录
                    ru = login(name, psd, runeUsers);
                    //跳转选择页面
                    if (ru != null) {
                        //循环选择符文
                        int nus2 = 0;
                        while (nus2 !=30) {
                            SceneUtil.select(ru);
                            int x = sc.nextInt();
                            if (x == 0) {
                                break;
                            } else if (x == 9) {
                                return;
                            } else {
                                //选择符文
                                Epigraph[] epigraphs = showRune(x, epi);
                                SceneUtil.showRune(epigraphs);
                                //获取选择的符文编号和数量
                                System.out.println("请输入选择的符文编号：");
                                int bh = sc.nextInt();
                                System.out.println("请输入选择的符文数量：");
                                int num = sc.nextInt();

                                //根据用户的选择情况，把选择的符文放到用户数组里面
                                //计算用户符文组合的总属性值
                                int nus = putRuneInUserEPI(x, bh, num, epi, ru);
                                if (nus == 10) {
                                    //跳回选择符文颜色的界面
                                    nus2 = getAllValueByRuneUser(ru);
                                    if(nus2 == 30){
                                        SceneUtil.select(ru);
                                        //根据用户选择，来确定是回到首页，还是清空数组
                                        int yy = sc.nextInt();
                                        if(yy == 1){
                                            break bj;
                                        }else{
                                            //清空数组，实际上就是重新赋值，指向的堆上地址变了
                                            ru.setEPI(new Epigraph[30]);
                                        }
                                    }
                                } else {
                                    System.out.println("当前已填充符文数量为" + nus);
                                    System.out.println("是否继续填充？");
                                    System.out.println("1.继续");
                                    System.out.println("-----------------------------");
                                    System.out.println("0.返回上一页--------9.离开大陆");
                                }
                            }
                        }
                    } else {
                        System.out.println("不存在该用户，请先注册");
                    }
                    break;
                case 2:
                    System.out.println("请输入用户名：");
                    String name2 = sc.next();
                    System.out.println("请输入密码：");
                    String psd2 = sc.next();
                    nu = register(name2, psd2, runeUsers);
                    if (nu == 1) {
                        System.out.println("注册成功，请登录");
                    } else {
                        System.out.println("注册失败，请重新注册");
                    }
                    break;
                case 9:
                    return;
            }
        }


    }


    /**
     * 用户注册
     *
     * @param name
     * @param password
     * @param runeUsers
     * @return
     */
    public static int register(String name, String password, RuneUser[] runeUsers) {
        //参数非空判断
        RuneUser runeUser = new RuneUser();
        runeUser.setRuname(name);
        runeUser.setPsd(password);
//        RuneUser runeUser1 = new RuneUser(name,password);

        //判断用户是否存在
        int is = userExist(runeUser, runeUsers);
        if (is == 1) {
            for (int j = 0; j < runeUsers.length; j++) {
                if (runeUsers[j] == null) {
                    runeUsers[j] = runeUser;
                    return is;
                }
            }
        }
        return is;
    }

    /**
     * 判断用户是否存在，1代表用户不存在，-1代表用户存在
     *
     * @param ru
     * @param runeUsers
     * @return
     */
    public static int userExist(RuneUser ru, RuneUser[] runeUsers) {
        //判断对象是否为空
        //判断用户是否存在
        for (int i = 0; i < runeUsers.length; i++) {
            if (runeUsers[i] != null) {
                //当用户没有注册过的时候，把用户放进数组中空的位置
                if (!runeUsers[i].getRuname().equals(ru.getRuname())) {
                    return 1;
                }
            } else if (i == runeUsers.length - 1) {
                return 1;
            }
        }
        return -1;
    }

    /**
     * 用户登录
     *
     * @param uname
     * @param password
     * @param runeUsers
     * @return
     */
    public static RuneUser login(String uname, String password, RuneUser[] runeUsers) {
        //判断用户是否存在
        for (int i = 0; i < runeUsers.length; i++) {
            if (runeUsers[i] != null) {
                //当用户名和密码都匹配的时候，说明用户存在，返回1
                if (runeUsers[i].getRuname().equals(uname) && runeUsers[i].getPsd().equals(password)) {
                    return runeUsers[i];
                }
            }
        }
        return null;
    }

    /**
     * 展示符文
     *
     * @param x
     * @param epi
     * @return
     */
    public static Epigraph[] showRune(int x, Epigraph[] epi) {
//      创建一个用来存储符文的展示数组
        Epigraph[] epis = new Epigraph[10];

        for (int i = 0; i < epi.length; i++) {
            //创建一个公共接受父类对象
            Epigraph eph = null;
            //1.橙色符文"
            if (x == 1) {
                if (epi[i] instanceof OrangeRune) {
                    eph = epi[i];
                }
            }
            //        2.蓝色符文"
            if (x == 2) {
                if (epi[i] instanceof BlueRune) {
                    eph = epi[i];
                }
            }
            //        3.绿色符文"
            if (x == 3) {
                if (epi[i] instanceof GreenRune) {
                    eph = epi[i];
                }
            }

            //放入展示数组
            for (int j = 0; j < epis.length; j++) {
                if (epis[j] == null) {
                    epis[j] = eph;
                    break;
                }
            }
        }
        //返回放好数据的数组
        return epis;
    }

    //把用户选中的符文放到用户数组里面
    public static int putRuneInUserEPI(int x, int bh, int num, Epigraph[] epi, RuneUser ru) {
        //判断用户数组内某种符文数量是否放满
        int nus = 0;
        //获取用户存放符文的数组
        Epigraph[] epi1 = ru.getEPI();
        //根据用户选择的符文数量，确定放进数组的符文个数
        for (int i = 0; i < num; i++) {
            //向用户数组放符文的时候，要在空的位置放，放完一次就结束一次
            for (int i1 = 0; i1 < epi1.length; i1++) {
                if (epi1[i1] == null) {
                    epi1[i1] = epi[bh];
                    break;
                }
            }

        }

        //判断用户数组内某种符文是否放满
        for (int i = 0; i < epi1.length; i++) {
            //1.橙色符文"
            if (x == 1) {
                if (epi1[i] instanceof OrangeRune) {
                    nus++;
                }
            }
            //        2.蓝色符文"
            if (x == 2) {
                if (epi1[i] instanceof BlueRune) {
                    nus++;
                }
            }
            //        3.绿色符文"
            if (x == 3) {
                if (epi1[i] instanceof GreenRune) {
                    nus++;
                }
            }
        }

        return nus;
    }

    //判断用户数组里有多少个符文
    public static int getAllValueByRuneUser(RuneUser runeUser){
        int num = 0;
        Epigraph[] epi = runeUser.getEPI();
        for (int i = 0; i < epi.length; i++) {
            if(epi[i] != null){
                num++;
            }
        }
        return num;
    }
}

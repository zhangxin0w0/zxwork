package com.itdr.games.runeland.utils;

import com.itdr.games.runeland.pojo.*;

/**
 * ClassName: SceneUtil
 * 日期: 2019/11/26 18:51
 *
 * @author Air张
 * @since JDK 1.8
 */
public class SceneUtil {

    //首页
    public static void home(RuneUser runeUser) {
        System.out.println("*****************************");
        if (runeUser != null) {
            System.out.println("---当前用户：" + runeUser.getRuname() + "---");
            System.out.println("---已选符文：" + getCountByUserEPI(runeUser) + "---");
        }
        System.out.println("欢迎来到符文大陆，请根据数字序号选择功能");
        System.out.println("1.用户登录");
        System.out.println("2.用户注册");
        System.out.println("9.离开大陆");
    }

    //选择符文页
    public static void select(RuneUser runeUser) {
        System.out.println("*****************************");
        if (runeUser != null) {
            System.out.println("---当前用户：" + runeUser.getRuname() + "---");
            System.out.println("---已选符文：" + getCountByUserEPI(runeUser) + "---");
        }
        //如果用户已经选满30个符文，我就问他是否确定
        if (getCountByUserEPI(runeUser) == 30) {
            System.out.println("当前选择符文属性总值：");
            String[] allValue = getAllValue(runeUser);
            for (int i = 0; i < allValue.length; i++) {
                System.out.println(allValue[i]);
            }
            System.out.println("是否确认当前符文组合");
            System.out.println("1.确认==2.清空");
        } else {
            //否则，我就让他一直选择符文
            System.out.println("欢迎来到符文大陆，请选择你想要的符文力量");
            System.out.println("一共有橙色、蓝色、绿色三种符文力量，每种符文力量可以选择10个");
            System.out.println("1.橙色符文");
            System.out.println("2.蓝色符文");
            System.out.println("3.绿色符文");
        }


        System.out.println("-----------------------------");
        System.out.println("0.返回上一页--------9.离开大陆");
    }

    //符文展示页面
    public static void showRune(Epigraph[] epi) {
        System.out.println("*****************************");
        System.out.println("请根据序号选择具体的符文和数量");

        for (int i = 0; i < epi.length; i++) {
            if (epi[i] instanceof OrangeRune) {
                OrangeRune o = (OrangeRune) epi[i];
                System.out.println(
                        "序号：" + i
                                + "===符文名称：" + o.ename
                                + "===符文属性：" + o.getAdHurt()
                                + "===符文类型：" + o.category);
            }
            if (epi[i] instanceof BlueRune) {
                BlueRune o = (BlueRune) epi[i];
                System.out.println("符文属性：" + o.getMaxLife());
            }
            if (epi[i] instanceof GreenRune) {
                GreenRune o = (GreenRune) epi[i];
                System.out.println("符文属性：" + o.getCd());
            }
        }
        System.out.println("-----------------------------");
        System.out.println("0.返回上一页--------9.离开大陆");
    }

    //抽取私有方法，判断用户已选符文数量
    private static int getCountByUserEPI(RuneUser runeUser) {
        int num = 0;
        if (runeUser != null) {
            //获取用户符文数组
            Epigraph[] epi = runeUser.getEPI();
            //判断数组中存在的元素个数
            for (int i = 0; i < epi.length; i++) {
                if (epi[i] != null) {
                    num++;
                }
            }
        }
        return num;
    }

    //计算用户数组内符文总属性值
    private static String[] getAllValue(RuneUser runeUser) {
        //创建一个存储总属性值的字符串数组
        String[] ss = new String[3];

        //获取用户数组内所有的符文
        Epigraph[] epi = runeUser.getEPI();

        //拼装属性
        int adHurt2 = 0;
        int maxLife2 = 0;
        double cd2 = 0;
        String adHurt = "物理攻击："+adHurt2;
        String maxLife = "最大生命："+maxLife2;
        String cd = "冷却时间："+cd2;

        for (int i = 0; i < epi.length; i++) {
            //1.橙色符文"
            if (epi[i] instanceof OrangeRune) {
                OrangeRune o = (OrangeRune) epi[i];
                adHurt2 += o.getAdHurt();
            }

            //2.蓝色符文"
            if (epi[i] instanceof BlueRune) {
                BlueRune o = (BlueRune) epi[i];
                maxLife2 +=o.getMaxLife();
            }

            //3.绿色符文"
            if (epi[i] instanceof GreenRune) {
                GreenRune o = (GreenRune) epi[i];
                cd2+=o.getCd();
            }

        }

        ss[0] = adHurt;
        ss[1] = maxLife;
        ss[2] = cd;

        return ss;
    }
}

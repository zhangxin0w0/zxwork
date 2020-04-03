package com.itdr.utils;

import com.itdr.pojo.JueSe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: PlayContentUtil
 * 日期: 2020/4/2 19:15
 *
 * @author Air张
 * @since JDK 1.8
 */
public class PlayContentUtil {

    // 副本1内容
    public static Map<String, List<String>> play(int lv) {
        // 初始化数据
        String[] trueKeyWord = {"class", "interface", "byte", "short", "int"};
        String[] falseKeyWord = {"Class", "interfice", "byta", "shrt", "integer"};
        // 存储最终展示数据的集合
        List<String> arrayList = new ArrayList<String>();
        // 存储最终展示错误数据的集合
        List<String> falseList = new ArrayList<String>();
        // 返回map集合
        Map<String, List<String>> map = new HashMap<>();

        // 随机取出x个正确的值
        for (int j = 0; j < trueKeyWord.length - lv; j++) {
            int round = (int) Math.round(Math.random() * (trueKeyWord.length - 1));
            arrayList.add(trueKeyWord[round]);
        }

        // 随机取出x个错误的值
        for (int j = 0; j < lv; j++) {
            int round = (int) Math.round(Math.random() * (falseKeyWord.length - 1));
            arrayList.add(falseKeyWord[round]);
            falseList.add(falseKeyWord[round]);
        }

        map.put("end", arrayList);
        map.put("false", falseList);

        return map;

    }

    // 副本1通关判断
    public static boolean pass(List<String> falseList, int lv, String count) {
        // 处理用户输入的数据
        String[] split = count.split("/");
        // 计数器
        int num = 0;
        // 将数组中的数据跟集合中数据进行比对
        for (String s : falseList) {
            for (int i = 0; i < split.length; i++) {
                if (s.equals(split[i])) {
                    num++;
                    break;
                }
            }
        }
        if(num == lv){
            return true;
        }
        return false;
    }

    // 副本1收益结算
    public static void passGetExeAndMoney(int lv, JueSe jueSe){
        // 增加经验值
        jueSe.setExe(jueSe.getExe()+lv*10);
        // 增加金币
        jueSe.setMoney(jueSe.getMoney()+lv*10);
    }
    // 副本2
    // 副本3
    // 副本4
    // 副本5
}

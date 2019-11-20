package com.itdr.basic3.demo1;

/**
 * ClassName: TestDemo
 * 日期: 2019/11/20 10:25
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo {
    public static void main(String[] args) {
        //在控制输出水杯的属性
        //然后使用水杯的功能
        String sname = "神圣的水杯";
        int sh = 100;
        char scolor = '金';

        System.out.println(sname);
        System.out.println(sh);
        System.out.println(scolor);
        System.out.println("水杯可以装水");

        System.out.println("==================");
        //创建一个水杯对象
        Cup c1 = new Cup();
        Cup c2 = new Cup();
        Cup c3 = new Cup();
        //给对象进行初始化（属性赋值）
        c1.sname = "圣杯1号";
        c1.sh = 100;
        c1.scolor = '红';

        c2.sname = "圣杯2号";
        c2.sh = 120;
        c2.scolor = '蓝';


        //我想看一下杯子的属性，并且用一下杯子的方法
        String s = c1.sname;
        System.out.println(s);

        String s2 = c2.sname;
        System.out.println(s2);
        System.out.println(c2.sh);
        System.out.println(c2.scolor);

        c3.getw();

    }
}

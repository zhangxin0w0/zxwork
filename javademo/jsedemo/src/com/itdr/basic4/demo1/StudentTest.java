package com.itdr.basic4.demo1;

/**
 * ClassName: StudentTest
 * 日期: 2019/11/22 15:06
 *
 * @author Air张
 * @since JDK 1.8
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sname = "张冶";
        s1.sh = 180;
        s1.sex = "男";
        System.out.println("我们班有一个同学："+s1.sname);
        System.out.println("TA身高："+s1.sh);
        System.out.println("TA的性别："+s1.sex);

        System.out.println("经过三周的相处，发生了一些奇怪的变化");
        s1.sh=100;
        s1.sex = "？";
        System.out.println("我们班有一个同学："+s1.sname);
        System.out.println("TA身高："+s1.sh);
        System.out.println("TA的性别："+s1.sex);

        System.out.println("有一个同学想调查一下，我们先看一下TA的信息");
        Student s2 = new Student();
        s2.sname = "冯胜";
        s2.sh = 180;
        s2.sex = "男";

        System.out.println("经过一番调查，事情向着不可预料的方向发展了。。。。。");
        s2.sh = 10000;
        s2.sex = "???";
        System.out.println("这位调查的同学："+s2.sname);
        System.out.println("TA身高："+s2.sh);
        System.out.println("TA的性别："+s2.sex);

        System.out.println("这时候来了一个神秘的魔法天才少女：");
        Student s3 = new Student();
        s3.sname = "？？？";
        s3.sh = 165;
        s3.sex = "女";
        System.out.println("神秘的魔法天才少女："+s3.sname);
        System.out.println("TA身高："+s3.sh);
        System.out.println("TA的性别："+s3.sex);

        System.out.println("进过变成巨人的调查同学的调查：");
        s3.sname = "小辉辉";
        s3.sex = "男";
        System.out.println("神秘的魔法天才少女："+s3.sname);
        System.out.println("TA身高："+s3.sh);
        System.out.println("TA的性别："+s3.sex);

    }
}

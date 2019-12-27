package com.itdr.test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * ClassName: TestDemo
 * 日期: 2019/12/19 9:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo {

    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("a");
        s.add("java");
        s.add(1);
        s.add(null);

        System.out.println(s);
    }
}

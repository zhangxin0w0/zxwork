package com.itdr2.common;

import com.itdr2.pojo.Prop;

import java.util.List;

/**
 * ClassName: DemoTest
 * 日期: 2020/4/17 16:03
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DemoTest {
    public static void main(String[] args) {
        PropController propController = new PropController();


        List<Prop> propList = propController.getPropList();

        for (Prop prop : propList) {
            System.out.println(prop.toString());
        }
    }
}

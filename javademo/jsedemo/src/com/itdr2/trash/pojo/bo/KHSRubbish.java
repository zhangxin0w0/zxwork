package com.itdr2.trash.pojo.bo;

/**
 * ClassName: KHSRubbish
 * 日期: 2019/12/27 14:37
 *
 * @author Air张
 * @since JDK 1.8
 */
public class KHSRubbish extends AbstractRubbish{
    @Override
    public void bad() {
        System.out.println("可回收垃圾能换钱");
    }
}

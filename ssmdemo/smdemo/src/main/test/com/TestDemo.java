package com;

import com.itdr.mapper.IndexMapper;
import com.itdr.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: TestDemo
 * 日期: 2019/11/11 8:57
 *
 * @author Air张
 * @since JDK 1.8
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDemo {

    @Autowired
    IndexMapper indexMapper;

    @Test
    public void test1(){
        String uname = "zhangxin";
        Users one = indexMapper.getOne(uname);
        System.out.println(one);
    }
}

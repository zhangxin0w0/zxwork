package com;

import com.itdr.controller.IndexController;
import com.itdr.mapper.IndexMapper;
import com.itdr.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import javax.lang.model.element.VariableElement;

/**
 * ClassName: TestDemo
 * 日期: 2019/11/4 9:31
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo {

    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
    }

    @Test
    public void test2(){
        IndexController indexController = new IndexController();
        String deflutReply = indexController.getDeflutReply();

        System.out.println("机器人："+deflutReply);
    }
}

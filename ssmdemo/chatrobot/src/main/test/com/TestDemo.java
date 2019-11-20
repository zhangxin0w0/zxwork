package com;

import com.itdr.controller.IndexController;
import com.itdr.mapper.IndexMapper;
import com.itdr.pojo.ReplyContent;
import com.itdr.service.IndexService;
import com.itdr.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.lang.model.element.VariableElement;
import java.util.List;

/**
 * ClassName: TestDemo
 * 日期: 2019/11/4 9:31
 *
 * @author Air张
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDemo {
    @Autowired
    private IndexService indexService;

   /* @Test
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

    @Test
    public void test3(){
        IndexController indexController = new IndexController();
        String autoReply = indexController.getAutoReply();
        System.out.println("机器人："+autoReply);
    }

    @Test
    public void test4(){
        IndexController indexController = new IndexController();
        String keyword = "好";
        List<String> reply = indexController.getReply(keyword);
        for (String s : reply) {
            System.out.println("赛丽亚："+s);
        }
    }

    @Test
    public void test5(){
        IndexController indexController = new IndexController();
        List<ReplyContent> all = indexController.getAll();
        for (ReplyContent s : all) {
            System.out.println(s);
        }
    }*/

    @Test
    public void test6() {
        ReplyContent replyContent = new ReplyContent();
        replyContent.setKeyword("你是谁？");
        replyContent.setReply("我是你最好的伙伴，赛丽亚！");
        replyContent.setCid(3);
        int i = indexService.addOne(replyContent);
        System.out.println(i);
    }


    /*@Test
    public void test7() {
        List<ReplyContent> all = indexService.getAll();
        for (ReplyContent replyContent : all) {
            System.out.println(replyContent);
        }
    }*/

    @Test
    public void test8() {
        int i = indexService.deleteOne(8);
        System.out.println(i);
    }
}

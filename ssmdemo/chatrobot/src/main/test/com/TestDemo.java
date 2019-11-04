package com;

import com.itdr.controller.IndexController;
import com.itdr.mapper.IndexMapper;
import com.itdr.pojo.ReplyContent;
import com.itdr.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import javax.lang.model.element.VariableElement;
import java.util.List;

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
    }

    @Test
    public void test6(){
        IndexController indexController = new IndexController();
        ReplyContent replyContent = new ReplyContent();
        replyContent.setKeyword("在吗？");
        replyContent.setReply("是的，我一直在等你！");
        replyContent.setCid(3);
        int i = indexController.addOne(replyContent);
        System.out.println(i);

    }
}

package com.itdr;

import com.itdr.mapper.UserDao;
import com.itdr.mapper.UserDaoImpl;
import com.itdr.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * ClassName: TsetDemo
 * 日期: 2019/10/28 14:42
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TsetDemo {

    /**
     * 1.测试数据库连接jar包是否可用
     * 2.测试数据库参数是否正确
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        //加载驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url="jdbc:mysql:///itdr_sd16";
        String username="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, username, password);

        //创建对象
        String sql = "select * from users";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //执行sql语句并获取结果集
        ResultSet resultSet = preparedStatement.executeQuery();

        //处理结果集
        while (resultSet.next()){
            String uname = resultSet.getString("uname");
            System.out.println("用户名："+uname);
        }

        //关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    @Test
    public void test2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println(sqlSessionFactory);
    }

    @Test
    public void test3(){
        UserDao userDao = new UserDaoImpl();
        Users one = userDao.getOne(18);
        System.out.println(one);
    }

    @Test
    public void test4(){
        UserDao userDao = new UserDaoImpl();

        Users u = new Users();
        u.setUname("小黑");
        u.setPsd("123");
        u.setAge(18);
        u.setMoney(100);

//        int i = userDao.addOne(u);
//        int i = userDao.updateOne(u);
        int i = userDao.deleteOne(u);
        System.out.println(i);
    }
}

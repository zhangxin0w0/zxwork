package com.itdr2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ClassName: JDBCUtil
 * 日期: 2020/4/17 15:55
 *
 * @author Air张
 * @since JDK 1.8
 */
public class JDBCUtil {

//    获取一个数据库连接
    public static Connection getCon(){
        Connection con = null;

        //        注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //创建连接
            String url = "jdbc:mysql://192.168.44.130:3306/hbdwjm";
            String user = "zhangxin";
            String password = "123456";
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}

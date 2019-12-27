package com.itdr;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * ClassName: JDBCDemo
 * 日期: 2019/12/24 14:39
 *
 * @author Air张
 * @since JDK 1.8
 */
public class JDBCDemo {
    public static void main(String[] args) {
        try {
            //2）建立连接
            //根据数据库地址，用户名，密码创建连接
            String url = "jdbc:mysql://localhost:3306/itdr11";
            String user = "root";
            String password = "123456";
            Connection con = JDBCUtil2.getCon();

            //3）创建对象
            Statement st = con.createStatement();

            //4）执行sql语句
            String sql = "select * from stu where id = 1";
            ResultSet rs = st.executeQuery(sql);

            //5）处理结果
            while (rs.next()){
                System.out.println(rs.getInt("id")+"---"+rs.getString("name"));
            }

            //6）关闭资源
            //从内向外关闭，不用一定要关闭
            JDBCUtil2.closeAll(con,st,rs);
        } catch (SQLException e) {
            System.out.println("这里出现了连接异常");
        }
    }
}

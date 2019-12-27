package com.itdr.dao;

import com.itdr.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UsersDao
 * 日期: 2019/12/26 10:32
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UsersDao {
    static QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    //增
    public int insertByUsernameAndPassword(String username, String password) {
        /*int i = 0;
        try {
            Connection con = JDBCUtil.getCon();
            String sql = "INSERT INTO itdruser VALUES(null,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            i = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        String sql = "INSERT INTO itdruser VALUES(null,?,?)";
        int i = 0;
        try {
            i = qr.update(sql, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //删
    //改
    //查
    //根据用户名查询一个用户
    public Users selectByUsername(String username) {
        Users u = null;
      /*  try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/itdr11";
            String user = "root";
            String password = "123456";
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM itdruser WHERE username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                u = new Users();
                u.setId(resultSet.getInt("id"));
                u.setUsername(resultSet.getString("username"));
                u.setPassword(resultSet.getString("password"));
            }
        }catch (Exception e){
            System.out.println("查询用户有异常");
            e.printStackTrace();
        }*/
        String sql = "SELECT * FROM itdruser WHERE username=?";
        try {
            u = qr.query(sql, new BeanHandler<Users>(Users.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    public List<Users> selectAll() {
        List<Users> li = null;
        String sql = "SELECT * FROM itdruser";
        try {
            li = qr.query(sql, new BeanListHandler<Users>(Users.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }
}

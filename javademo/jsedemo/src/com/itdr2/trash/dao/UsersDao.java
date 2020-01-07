package com.itdr2.trash.dao;

import com.itdr2.trash.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * ClassName: UsersDao
 * 日期: 2019/12/27 15:05
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UsersDao {
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    //查询用户
    public Users selectByUname(String uname) throws SQLException {
        String sql = "select * from itdruser where username=?";
        Users query = qr.query(sql, new BeanHandler<Users>(Users.class), uname);
        return query;
    }
    //增加新用户
    public int insertByUname(Users u) throws SQLException {
        String sql = "insert into itdruser values(null,?,null,0)";
        int i = qr.update(sql,u);
        return i;
    }

    public int updateBySort(Integer num) {
        String sql = "update  itdruser set sort = ?";
        int i = 0;
        try {
            i = qr.update(sql,num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}

package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: UserRowMapper
 * 日期: 2020/11/2 16:44
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet r, int i) throws SQLException {
        User u = new User();
        u.setId(r.getInt("id"));
        u.setUsername(r.getString("username"));
        u.setPassword(r.getString("password"));
        return u;
    }
}

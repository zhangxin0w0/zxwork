package com.itdr.pojo.bo;

import com.itdr.pojo.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: UserRowMapper
 * 日期: 2019/10/21 11:25
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserRowMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet rs, int i) throws SQLException {
        Users u = new Users();
        u.setId(rs.getInt("id"));
        u.setUphone(rs.getString("uphone"));
        u.setUpsd(rs.getString("upsd"));
        u.setUemail(rs.getString("uemail"));
        u.setUage(rs.getInt("uage"));
        u.setUsex(rs.getString("usex"));

        u.setCreate_time(rs.getDate("create_time"));
        u.setUpdate_time(rs.getDate("update_time"));

        return u;
    }
}

package com.itdr.mapper;

import com.itdr.pojo.Users;
import com.itdr.pojo.bo.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: UserMapper
 * 日期: 2019/10/21 11:23
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class UserMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Users selectByUphoneAndUpsd(String uphone, String upsd) {
        String sql = "select * from users where uphone=? and upsd=?";
        Users u = jdbcTemplate.queryForObject(sql, new UserRowMapper(), uphone, upsd);
        return u;
    }

    public List<Users> selectByKeyWord(String keyword) {
        String sql = "select * from users where uphone like ?";
        List<Users> li = jdbcTemplate.query(sql, new UserRowMapper(), keyword);
        return li;
    }
}

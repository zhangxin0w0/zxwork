package com.itdr.mapper;

import com.itdr.pojo.User;
import com.itdr.pojo.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: UserMapper
 * 日期: 2020/11/2 15:14
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class UserMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private int baseUpdate(String sql,Object... arg){
        return jdbcTemplate.update(sql,arg);
    }

    private <T> List<T> baseQuery(String sql, RowMapper<T> r,Object... arg){
        return jdbcTemplate.query(sql, r, arg);
    }

    public User selectByUserName(String userName) {
        String sql = "select * from dnf_user where username=?";
        List<User> query = baseQuery(sql,new UserRowMapper(),userName);
        if(query.size() == 0 ){
            return null;
        }
        return query.get(0);
    }

    public int insertOne(String userName, String passWord) {
        String sql = "insert into dnf_user values (null,?,?)";
        return baseUpdate(sql,userName,passWord);
    }
}

package com.itdr.mapper;

import com.itdr.pojo.Role;
import com.itdr.pojo.RoleRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: RoleMapper
 * 日期: 2020/11/9 14:25
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class RoleMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Role selectByUidAndNikeName(Integer uid, String nikeName) {
        String sql = "select * from role where uid=? and nikename=?";
        try {
            Role role = jdbcTemplate.queryForObject(sql, new RoleRowMapper(), uid, nikeName);
            return role;
        }catch (Exception e){
            return null;
        }
    }

    public int insert(Role r, Integer uid) {
        String sql = "insert into role values(null,?,?,?,1,100,?)";
        return jdbcTemplate.update(sql,r.getNikeName(),r.getWork(),r.getSex(),uid);
    }

    public List<Role> selectAll(Integer uid) {
        String sql = "select * from role where uid=?";
        return jdbcTemplate.query(sql, new RoleRowMapper(), uid);
    }
}

package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: RoleMapper
 * 日期: 2020/11/9 14:28
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RoleRowMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet rs, int i) throws SQLException {
        Role role = new Role();
        role.setId(rs.getInt("id"));
        role.setNikeName(rs.getString("nikename"));
        role.setWork(rs.getString("work"));
        role.setSex(rs.getString("sex"));
        role.setLv(rs.getInt("lv"));
        role.setMoney(rs.getInt("money"));
        role.setUid(rs.getInt("uid"));
        return role;
    }
}

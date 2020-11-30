package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: REXRowMapper
 * 日期: 2020/11/16 16:42
 *
 * @author Air张
 * @since JDK 1.8
 */
public class REXRowMapper implements RowMapper<REX> {
    @Override
    public REX mapRow(ResultSet rs, int i) throws SQLException {
        REX rex = new REX();
        rex.setId(rs.getInt("id"));
        rex.setUid(rs.getInt("uid"));
        rex.setRid(rs.getInt("rid"));
        rex.setLv(rs.getInt("lv"));
        rex.setLve(rs.getInt("lve"));
        rex.setMoney(rs.getInt("money"));
        return rex;
    }
}

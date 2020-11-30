package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: DJRowMapper
 * 日期: 2020/11/9 16:15
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DJRowMapper implements RowMapper<DJ> {
    @Override
    public DJ mapRow(ResultSet rs, int i) throws SQLException {
        DJ dj = new DJ();
        dj.setId(rs.getInt("id"));
        dj.setDname(rs.getString("dname"));
        dj.setDlv(rs.getInt("dlv"));
        dj.setDprice(rs.getInt("dprice"));
        dj.setDstock(rs.getInt("dstock"));
        return dj;
    }
}

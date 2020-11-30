package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: GZRowMapper
 * 日期: 2020/11/16 10:03
 *
 * @author Air张
 * @since JDK 1.8
 */
public class GZRowMapper implements RowMapper<GZ> {
    @Override
    public GZ mapRow(ResultSet rs, int i) throws SQLException {
        GZ gz = new GZ();
        gz.setId(rs.getInt("id"));
        gz.setRname(rs.getString("rname"));
        gz.setSuc(rs.getString("suc"));
        gz.setFail(rs.getString("fail"));
        gz.setNum(rs.getInt("num"));
        return gz;
    }
}

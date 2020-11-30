package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: FBRowMapper
 * 日期: 2020/11/9 15:54
 *
 * @author Air张
 * @since JDK 1.8
 */
public class FBRowMapper implements RowMapper<FB> {
    @Override
    public FB mapRow(ResultSet rs, int i) throws SQLException {
        FB fb = new FB();
        fb.setId(rs.getInt("id"));
        fb.setFname(rs.getString("fname"));
        fb.setNd(rs.getInt("nd"));
        fb.setDj(rs.getInt("dj"));
        fb.setExe(rs.getInt("rexe"));
        fb.setMoney(rs.getInt("rmoney"));
        return fb;
    }
}

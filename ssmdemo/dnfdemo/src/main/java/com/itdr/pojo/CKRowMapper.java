package com.itdr.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: CKRowMapper
 * 日期: 2020/11/9 16:08
 *
 * @author Air张
 * @since JDK 1.8
 */
public class CKRowMapper implements RowMapper<CK> {
    @Override
    public CK mapRow(ResultSet rs, int i) throws SQLException {
        CK ck = new CK();
        ck.setId(rs.getInt("id"));
        ck.setCapacity(rs.getInt("capacity"));
        ck.setDjid(rs.getInt("djid"));
        ck.setDjnum(rs.getInt("djnum"));
        ck.setRid(rs.getInt("rid"));
        return ck;
    }
}

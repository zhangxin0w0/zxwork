package com.itdr.mapper;

import com.itdr.pojo.CK;
import com.itdr.pojo.CKRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: CKMapper
 * 日期: 2020/11/9 16:07
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class CKMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<CK> selectByRid(Integer roleId) {
        String sql = "select * from ck where rid=?";
        return jdbcTemplate.query(sql,new CKRowMapper(),roleId);
    }
}

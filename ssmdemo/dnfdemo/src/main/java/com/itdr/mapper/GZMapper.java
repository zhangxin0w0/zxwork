package com.itdr.mapper;

import com.itdr.pojo.GZ;
import com.itdr.pojo.GZRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: GZMapper
 * 日期: 2020/11/16 10:04
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class GZMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public GZ selectById(Integer type) {
        String sql = "select * from gz where id=?";
        return jdbcTemplate.queryForObject(sql,new GZRowMapper(),type);
    }
}

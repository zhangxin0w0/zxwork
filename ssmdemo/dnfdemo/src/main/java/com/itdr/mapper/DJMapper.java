package com.itdr.mapper;

import com.itdr.pojo.DJ;
import com.itdr.pojo.DJRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: DJMapper
 * 日期: 2020/11/9 16:13
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class DJMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public DJ selectById(Integer djid) {
        String sql = "select * from dj where id=?";
        try {
            DJ dj = jdbcTemplate.queryForObject(sql, new DJRowMapper(), djid);
            return dj;
        }catch (Exception e){
            return null;
        }
    }

    public List<DJ> selectAll() {
        String sql = "select * from dj";
        return jdbcTemplate.query(sql,new DJRowMapper());
    }
}

package com.itdr.mapper;

import com.itdr.pojo.FB;
import com.itdr.pojo.FBRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: FBMapper
 * 日期: 2020/11/9 15:52
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class FBMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<FB> selectAll() {
        String sql = "select * from fb";
        return jdbcTemplate.query(sql,new FBRowMapper());
    }

    public FB selectById(Integer fid) {
        String sql = "select * from fb where id=?";
        return jdbcTemplate.queryForObject(sql,new FBRowMapper(),fid);
    }
}

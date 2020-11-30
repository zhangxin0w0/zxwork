package com.itdr.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: REXMapper
 * 日期: 2020/11/16 17:03
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class REXMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int updateOne(Integer uid, Integer rid, int m, int n) {
        String sql = "update rex set lve=lve+? and money=money+? where uid=? and rid=?";
        return jdbcTemplate.update(sql,m,n,uid,rid);
    }
}

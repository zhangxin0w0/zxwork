package com.itdr2.trash.dao;

import com.itdr2.trash.pojo.Rubbish;
import com.itdr2.trash.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: RubbishDao
 * 日期: 2019/12/27 15:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishDao {
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    public List<Rubbish> selectAll() {
        String sql = "select * from rubbish";
        List<Rubbish> li  = null;
        try {
            li = qr.query(sql, new BeanListHandler<Rubbish>(Rubbish.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }
}

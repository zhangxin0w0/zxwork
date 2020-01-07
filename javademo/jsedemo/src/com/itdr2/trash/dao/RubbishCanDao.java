package com.itdr2.trash.dao;

import com.itdr2.trash.pojo.RubbishCan;
import com.itdr2.trash.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * ClassName: RubbishCanDao
 * 日期: 2019/12/27 16:28
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishCanDao {
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    public RubbishCan selectByRname(RubbishCan rc) {
        String sql = "select * from rubbishcan where rname=?";
        RubbishCan query = null;
        try {
            query = qr.query(sql, new BeanHandler<RubbishCan>(RubbishCan.class), rc.getRname());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }
}

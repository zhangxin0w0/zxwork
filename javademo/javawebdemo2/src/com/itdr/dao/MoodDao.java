package com.itdr.dao;

import com.itdr.pojo.Mood;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * ClassName: MoodDao
 * 日期: 2020/1/7 19:34
 *
 * @author Air张
 * @since JDK 1.8
 */
public class MoodDao {


    public Mood selectById(int i) {
        Mood query = null;
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
        try {
            query = qr.query("select * from mood where id = ?", new BeanHandler<Mood>(Mood.class), i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }
}

package com.itdr.mapper;

import com.itdr.pojo.Users;
import com.itdr.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * ClassName: UserDaoImpl
 * 日期: 2019/10/28 15:48
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserDaoImpl implements UserDao{
    @Override
    public Users getOne(Integer uid) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        Users u = sqlSession.selectOne("getOne", uid);
        return u;
    }
    @Override
    public int addOne(Users u) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        int i = sqlSession.insert("addOne", u);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
    @Override
    public int updateOne(Users u) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        int i = sqlSession.update("updateOne", u);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
    @Override
    public int deleteOne(Users u) {
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        int i = sqlSession.delete("deleteOne", u);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}

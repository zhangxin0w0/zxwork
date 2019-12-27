import com.itdr.controller.UsersController;
import com.itdr.pojo.A;
import com.itdr.pojo.Users;
import com.itdr.services.UsersService;
import com.itdr.utils.PropertiesUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: DemoTest
 * 日期: 2019/12/25 16:09
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DemoTest {

    @Test
    public void test1() throws SQLException {
        ComboPooledDataSource m = new ComboPooledDataSource();
        Connection connection = m.getConnection();
//        System.out.println(connection);
        String sql = "select * from stu";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int i = resultSet.getInt(1);
            String s = resultSet.getString("name");
            System.out.println("id:" + i + "---" + "name:" + s);
        }
    }

    @Test
    public void test2() {
        UsersController us = new UsersController();
        int i = us.register("zx3", "123456");
        System.out.println(i);
    }

    @Test
    public void test3() {
        UsersController us = new UsersController();
        List<Users> all = us.getAll();
        for (Users users : all) {
            System.out.println(users);
        }
    }

    @Test
    public void test4() throws Exception {
        Users u = new Users();
//        u.setUsername("zhangxin");
//        System.out.println(u);

//        String name = u.getClass().getName();
//        System.out.println(name);
        String className = PropertiesUtil.getValue("className");

        Class<?> aClass = Class.forName(className);
        if (aClass.isInterface()) {
            UsersService us = (UsersService) aClass.newInstance();
            List<Users> all = us.getAll();
            System.out.println(all);
        } else {
            System.out.println("类型转换有问题");
        }

    }

    @Test
    public void test5() throws Exception {
        Class<?> aClass = Class.forName("com.itdr.pojo.A");
        Constructor<?>[] cs = aClass.getConstructors();
        for (Constructor<?> c : cs) {
            System.out.println(c);
            Object o = c.newInstance();
        }
    }

    @Test
    public void test6() throws Exception {
        Class<?> aClass = Class.forName("com.itdr.pojo.A");
        Object o = aClass.newInstance();

//        A a = new A();
//        a.setM(1);
//        a.setS("java");

        Field[] ff = aClass.getDeclaredFields();
        for (Field field : ff) {
            field.setAccessible(true);

            Class<?> type = field.getType();
            String name = type.getName();
            if (name.equals("java.lang.Integer")) {
                field.set(o, 10);
            }
            if(name.equals("java.lang.String")){
                field.set(o, "java");
            }
        }
        System.out.println(o);
    }
}

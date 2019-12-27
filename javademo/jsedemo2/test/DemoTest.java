import com.itdr.JDBCUtil2;
import com.itdr.PoolDemo;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * ClassName: DemoTest
 * 日期: 2019/12/24 16:11
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DemoTest {

    @Test
    public void test1() throws SQLException {
        Connection con = JDBCUtil2.getCon();
        Statement statement = con.createStatement();
        String sql = "select * from stu where id = 1 or 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }

    @Test
    public void test2() throws SQLException {
        Connection con = JDBCUtil2.getCon();
        String sql = "select * from stu where id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,"1 or 1");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }

    @Test
    public void test3() throws SQLException {
        Connection con = PoolDemo.getCon();
        System.out.println(con);
        PoolDemo.addBack(con);
    }

    @Test
    public void test4() throws SQLException {
        PoolDemo P = new PoolDemo();
        Connection con2 = P.getCon2();
        System.out.println(con2);
        P.addBack2(con2);
    }
}

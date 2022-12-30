import com.example.musicDemo.service.Impl.userServiceImpl;
import com.example.musicDemo.service.userService;
import com.example.musicDemo.util.JDBC1;

import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        Connection getconn = JDBC1.getconn();

        userService userService = new userServiceImpl();
        System.out.println(getconn);
    }
}

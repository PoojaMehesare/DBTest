import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    public static Connection connection;
    @BeforeTest
    public Connection getConnection() throws SQLException{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datatest","root","root");
        System.out.println("connection is successful:"+ connection);
        return connection;
}}

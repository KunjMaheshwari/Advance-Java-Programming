package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Demo {
    public static void main(String args[]) throws SQLException{

        String sql = "select name from product where id=5";
        String url = "jdbc:postgresql://localhost:5432/jdbceg1";
        String username = "postgres";
        String password = "test123";


        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
    }
}


// For JDBC We need 7 basic things 
//1. Import the package
//2. Load the drivers
//3. Execute the drivers
//4. Register the driver
//5. Create connections
//6. Create Statements
//7. Close

package CityBank;
import java.sql.*;


public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost/city_bank";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB() {
        Connection conn =null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch (Exception ex) {
            System.out.println("There were errors while connection to Database.");
            return null;
        }
    }
    
}

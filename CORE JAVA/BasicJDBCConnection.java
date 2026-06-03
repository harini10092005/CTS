import java.sql.Connection;
import java.sql.DriverManager;

public class BasicJDBCConnection {

    public static void main(String[] args) {

        Connection con = null;

        try {

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password"
            );

            System.out.println("Connected Successfully");

        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {

            try {

                if(con != null)
                    con.close();

            } catch(Exception e) {

                System.out.println(e);
            }
        }
    }
}
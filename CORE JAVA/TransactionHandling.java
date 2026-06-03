import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling {

    public static void main(String[] args) {

        Connection con = null;

        try {

            // Load Driver
            Class.forName(
                    "com.mysql.cj.jdbc.Driver");

            // Create Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password"
            );

            // Disable Auto Commit
            con.setAutoCommit(false);

            System.out.println(
                    "Transaction Started");

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            st.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS student(id INT)"
            );

            // Commit Transaction
            con.commit();

            System.out.println(
                    "Transaction Committed");

            // Close Connection
            con.close();

        } catch (Exception e) {

            System.out.println(
                    "Error: " + e);
        }
    }
}
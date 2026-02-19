import java.sql.*;

public class GenerateSQLException {

    public static void main(String[] args) throws SQLException {

        DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "wrongpassword");
    }
}

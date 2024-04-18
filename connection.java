import java.sql.*;

public class connection {
    public static String url = "jdbc:mysql://localhost:3306/"; // URL of the database
    public static String username = "root";
    public static String password = "root";

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet Exedute(String query) throws SQLException {
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        stmt.close();
        conn.close();
        return rs;
    }

}

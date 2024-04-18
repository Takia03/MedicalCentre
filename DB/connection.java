package DB;

import java.sql.*;

public class connection {
    public static String url = "jdbc:oracle:thin:@localhost:1521:xe"; // URL of the database
    public static String username = "medical";
    public static String password = "medical";

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
        ResultSet result = stmt.executeQuery(query);
        stmt.close();
        conn.close();
        return result;
    }

    public static int Execute(String query) throws SQLException {
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        int rowsAffected = stmt.executeUpdate(query);
        stmt.close();
        conn.close();
        return rowsAffected;
    }

}

package ru.schernigin.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;


/**
 * Class SQLStorage.
 * @author schernigin.
 * @since 03.02.2017.
 * @version 1.0
 */
public class SQLStorage {
    private static final Logger Log = LoggerFactory.getLogger(SQLStorage.class);

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/myBase";
        String userName = "postgres";
        String password = "QW1tujhrf2012";
        Connection conn = null;
        try {
          conn = DriverManager.getConnection(url, userName, password);
            PreparedStatement st = conn.prepareStatement("SELECT * FROM users AS u WHERE u.id IN (?, ?)");
            st.setInt(1, 1);
            st.setInt(2, 3);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                System.out.println(String.format("%s %s", rs.getString("login"), rs.getDate("create_date")));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Log.error(e.getMessage(), e);
                }
            }
        }
    }

}

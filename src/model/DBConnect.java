package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {

    //Patrón de diseño singleton
    private static java.sql.Connection connection = null;
    private ResultSet results = null;

    public DBConnect() {
    }

    public synchronized static java.sql.Connection getInstance() throws SQLException {
        if (connection == null) {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dad", "admin", "1234");
        }
        return connection;
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        Statement statement = getInstance().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        return statement.executeQuery(sql);
    }

    public int executeSQLUpdate(String sql) throws SQLException {
        Statement statement = getInstance().createStatement();
        return statement.executeUpdate(sql);
    }
}

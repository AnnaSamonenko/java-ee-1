package main;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SharesDAOimpl implements SharesDAO {
    private Connection connection;
    private String URL = "jdbc:mysql://localhost:3306/shares?useSSL=false";
    private String USERNAME = "root";
    private String PASSWORD = "root";

    public SharesDAOimpl() {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void create(Shares sh) {
        String sql = "INSERT INTO shares(name, price, type)"
                + " values('" + sh.getName() + "'," + sh.getPrice()
                + ",'" + sh.getType() + "');";
        executeSQL(sql);
    }

    private void executeSQL(String sql) {
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            st.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
}

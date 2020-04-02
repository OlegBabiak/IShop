package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ishop";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "qwerty";

  public static Connection getConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Can't connect to DB");
    }
  }
}

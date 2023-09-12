

package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseProject {

     public static void main(String[] args) {
    Connection conn = null;
    try {
      String url = "jdbc:mysql://localhost:3306/mydb";
      conn = DriverManager.getConnection(url);

      System.out.println("Got it!");

    } catch (SQLException e) {
        throw new Error("Problem", e);
    } finally {
      try {
        if (conn != null) {
            conn.close();
        }
      } catch (SQLException ex) {
          System.out.println(ex.getMessage());
      }
    }
  }
}

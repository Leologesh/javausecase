package in.vamsoft.spencer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DBConnectionUtil {

  public static Logger logger = Logger.getLogger(DBConnectionUtil.class);

  public static Connection getConnection() {

    String driver = null;
    String url = null;
    String uname = null;
    String password = null;
    Connection con = null;
    try {
      FileReader fileReader = new FileReader("db.properties");
      Properties properties = new Properties();
      properties.load(fileReader);
      driver = properties.getProperty("driver");
      url = properties.getProperty("url");
      uname = properties.getProperty("user");
      password = properties.getProperty("password");

      Class.forName(driver);
      con = DriverManager.getConnection(url, uname, password);
          } catch (FileNotFoundException e) {
      
    } catch (ClassNotFoundException e) {
      
      e.printStackTrace();
    } catch (SQLException e) {
      
      e.printStackTrace();
    } catch (IOException e) {
     
      e.printStackTrace();
    }
    return con;

  }
  public static void closeConnection(Connection conn) {
    try {
      conn.close();
    } catch (SQLException e) {
      
      e.printStackTrace();
    }
  }

}
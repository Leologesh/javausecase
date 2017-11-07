package in.vamsoft.spencer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

public class JDBCPrj {

  public static Logger logger = Logger.getLogger(JDBCPrj.class);

  public static void main(String[] args) {
    Connection con = null;
//    Statement stmt = null;
//    ResultSet rs = null;

    try {
      con = DBConnectionUtil.getConnection();
      System.out.println("JDBCPrj.main()");
     
  }
    catch (Exception e) {
		// TODO: handle exception
	}
  }
}
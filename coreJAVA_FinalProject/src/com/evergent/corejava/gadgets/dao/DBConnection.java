package com.evergent.corejava.gadgets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
/*public class DBConnection 
{
  public static Connection getConnection()   throws Exception
  {
	Class.forName("com.mysql.jdbc.Driver");
	  Connection  conn = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/evergentdb",
			  "root",
			  "admin"); 
	  String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection conn = DriverManager.getConnection(
	              "jdbc:oracle:thin:@localhost:1521:XE","capgmulesoft","capgmulesoft");
	return conn;
  }

}
*/

import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        
        // Connect to the database
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/evergentdb",
            "root",
            "admin"
        );
    }
}

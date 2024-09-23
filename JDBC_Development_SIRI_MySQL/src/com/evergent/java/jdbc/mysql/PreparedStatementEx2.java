package com.evergent.java.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementEx2 {
public static void main(String[] args) throws Exception{
   Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "evergentdb";
    String driverName = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "admin";
    
    System.out.println("MySQL Connect example");
    Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
    conn = DriverManager.getConnection(url+dbName, userName, password);
    String query = "insert into Info1 values (?,?,?)";
    //Step 1: Get Prepared Statement
    PreparedStatement pstmt= conn.prepareStatement(query);
    //Step 2: Set parameters
    pstmt.setString(1, "Tom");
    pstmt.setInt(2, 10);
    pstmt.setDouble(3, 35000.66);
    //Step 3: Excure the Query
    int i =pstmt.executeUpdate();
    System.out.println("Record inserted count: " +i);
    
    
    pstmt.setString(1, "Siri");
    pstmt.setInt(2, 20);
    pstmt.setDouble(3, 45000.66);
    //Step 3: Excure the Query
    i =pstmt.executeUpdate();
    System.out.println("Query executed for the second time count: " +i);
}
}
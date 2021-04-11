package ru;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class Connect {
private static final String USERNAME="kuzia";
private static final String PASSWORD="mk1050642";
private static final String URL="jdbc:mysql://localhost/Book?serverTimezone=UTC";
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Driver driver = null;

       // try {

             //   driver = new FabricMySQLDriver();
       // }
         //  catch (SQLException e){
            //    System.out.println("Error Create Driver");
            }
     //  try{
        //    DriverManager.registerDriver(driver);
     //   }
       // catch (SQLException e){
      //      System.out.println("Don t Register Driver");
      //  }
       // try {


       // connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        //    System.out.println("code.....");
    }
       // catch (SQLException e){
        //    System.out.println("Create Connection");
        //    return;
      //  }
       // finally {
         //  if(connection !=null)
        //       connection.close();
       // }
      //  }
  //  }


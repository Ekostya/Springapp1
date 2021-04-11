package ru;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Connector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(Driver.class.getName());

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","mk1050642");
        Statement statement =connection.createStatement();
        statement.execute("SELECT * FROM user");
        statement.close();
        connection.close();
    }
}

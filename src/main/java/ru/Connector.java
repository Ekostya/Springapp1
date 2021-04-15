package ru;


import java.sql.*;


public class Connector {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(Driver.class.getName());

        String query = "select * from user";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "mk1050642");
        Statement statement = connection.createStatement();
        ResultSet resultSet=statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);
            String email=resultSet.getString(4);
            System.out.printf("id: %d, name: %s, password: %s %n,email: %s %n", id, name,password,email);
        }
            statement.close();
            connection.close();
        }
    }

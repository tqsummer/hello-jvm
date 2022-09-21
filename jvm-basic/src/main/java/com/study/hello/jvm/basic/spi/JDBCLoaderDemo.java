package com.study.hello.jvm.basic.spi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCLoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("loader");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306");
    }
}

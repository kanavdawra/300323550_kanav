package com.company;

import java.sql.*;
// github link https://github.com/kanavdawra/300323550_kanav
public class Main {
    static Connection connection;
    static Statement statement;
    static App App;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        connection();
        statement=connection.createStatement();
        App App=new App();
        App.setTitle("Compound Interest");
        App.setVisible(true);

    }
    static void connection () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost/savings","root","");
    }
}

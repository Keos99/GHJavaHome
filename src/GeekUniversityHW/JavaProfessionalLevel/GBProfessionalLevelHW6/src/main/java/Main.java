package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW6.src.main.java;

import java.sql.*;

public class Main {
    public static Connection connection;
    public static Statement statement;

    public static boolean getSurnameByScore(int score) throws SQLException{
        return statement.execute("SELECT surname FROM Students WHERE score = '" + score + "';");
    }

    public static int add(String id, String surename, String score) throws SQLException{
        return statement.executeUpdate("INSERT INTO Students (id, surname, score) VALUES ('" + id + "', '" + surename + "', '" + score + "');");
    }

    public static int deleteByScore(String score) throws SQLException{
        return statement.executeUpdate("DELETE FROM Students WHERE score = '" + score + "';");
    }

    public static int updateSurnameByScore(String surname, String score) throws SQLException{
        return statement.executeUpdate("UPDATE Students SET surname ='" + surname + "' WHERE score = '" + score + "';");
    }

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:GBProfessionalLevelHW6.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

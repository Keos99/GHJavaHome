package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW2.src;

import java.sql.*;

public class Queries {

    public void crateTable(Statement statement){
        try {
            statement.execute("CREATE TABLE IF NOT EXISTS Goods(ID INTEGER PRIMARY KEY AUTOINCREMENT, ProdID INTEGER UNIQUE, Title TEXT,Cost INTEGER);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void crateGoods (PreparedStatement preparedStatement, Connection connection, Statement statement) {
        try {
            connection.setAutoCommit(false);
            statement.executeUpdate("DELETE FROM Goods");
            preparedStatement = connection.prepareStatement("INSERT INTO Goods (ProdID, Title, Cost) VALUES (?,?,?);");
            for (int i = 1; i <= 10000; i++) {
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"товар" + i);
                preparedStatement.setInt(3,i * 10);
                preparedStatement.executeUpdate();
            }
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getGoodsByPrise(String cost, ResultSet resultSet, Statement statement){
        try {
            resultSet = statement.executeQuery("SELECT Title FROM Goods WHERE Cost= '" + cost + "';");
          if (resultSet.next()){
              System.out.println("Товар по выбранной цене: " + resultSet.getString("Title"));
            } else {
              System.out.println("Товара с такой ценой нет!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGoodsCost(Statement statement, String title, String cost){
        try {
            statement.executeUpdate("UPDATE Goods SET Cost ='" + cost + "' WHERE Title = '" + title + "';");
            System.out.println("Цена изменена!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getGoodsByPriceRange(String mincost, String maxcost, ResultSet resultSet, Statement statement) {
        try {
            resultSet = statement.executeQuery("SELECT Title FROM Goods WHERE Cost >= '" + mincost + "' AND Cost <= '" + maxcost + "';");
            while (resultSet.next()){
                System.out.println("Товар по выбранному диаппазону цен: " + resultSet.getString("Title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

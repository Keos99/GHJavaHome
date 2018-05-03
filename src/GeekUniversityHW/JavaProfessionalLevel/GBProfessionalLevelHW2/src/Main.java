import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        Queries queries = new Queries();
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        connect();

        try {
            statement = connection.createStatement();

            queries.crateTable(statement);
            queries.crateGoods(preparedStatement, connection, statement);

            Thread thread = new Thread(new Runnable() {
                String command;
                @Override
                public void run() {
                    while (true){
                        System.out.println("Введите ваш запрос:");
                        try {
                            command = keyboard.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if(command.contains("/цена")) {
                            String[] data = command.split("\\s", 2);
                            queries.getGoodsByPrise(data[1], resultSet, statement);
                        } else if (command.contains("/сменитьцену")) {
                            String[] data = command.split("\\s", 3);
                            queries.updateGoodsCost(statement, data[1], data[2]);
                        } else if (command.contains("/товарыпоцене")){
                            String[] data = command.split("\\s", 3);
                            String mincost;
                            String maxcost;
                            int integer1 = Integer.parseInt(data[1]);
                            int integer2 = Integer.parseInt(data[2]);
                            if (integer1 < integer2){
                                mincost = data[1];
                                maxcost = data[2];
                            } else {
                                mincost = data[2];
                                maxcost = data[1];
                            }
                            queries.getGoodsByPriceRange(mincost,maxcost,resultSet,statement);
                        } else if (command.contains("/выход")){
                            disconnect();
                            return;
                        }
                    }
                }
            });

            thread.start();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:DBHW2.db");
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

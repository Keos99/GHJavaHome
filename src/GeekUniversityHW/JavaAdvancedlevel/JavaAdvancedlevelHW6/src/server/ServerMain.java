package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW6.src.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("ServerMain started...Waiting for clients");
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                new ClientHandler(socket);
            }


        } catch (IOException e){
            e.printStackTrace();
        }
    }

}

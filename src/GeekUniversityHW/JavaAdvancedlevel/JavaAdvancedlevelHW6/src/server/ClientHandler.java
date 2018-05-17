package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW6.src.server;


import java.io.*;
import java.net.Socket;

public class ClientHandler {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private DataInputStream serverin;
    BufferedReader br;

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            this.serverin = new DataInputStream(System.in);
            this.br = new BufferedReader(new InputStreamReader(System.in));

            new Thread(() -> {
                try {
                    while (true) {
                        String msg = in.readUTF();
                        System.out.println("from ru.jchat.core.client: " + msg);
                        out.writeUTF("echo: " + msg);
                        if (msg.equals("/end")) break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }).start();

            new Thread(() -> {
                System.out.println("Вы можете отправлять сообщения пользователю! Просто введите нужный текст в консоли.");
                while (true) {
                    try {
                            String servermsg = br.readLine();
                            out.writeUTF("Сообщение с сервера: " + servermsg);
                            System.out.println("Отправлено сообщение на клиент: " + servermsg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

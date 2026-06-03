import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {

        try {

            ServerSocket server =
                    new ServerSocket(5000);

            System.out.println("Server Started");

            Socket socket = server.accept();

            PrintWriter out =
                    new PrintWriter(
                    socket.getOutputStream(),
                    true
            );

            out.println("Hello Client");

            socket.close();
            server.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
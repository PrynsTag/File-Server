package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080, 50, InetAddress.getByName("127.0.0.1"))) {
            System.out.println("Server started!");

            try (
                    Socket socket = server.accept();
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream())
            ) {
                String received = input.readUTF();

                String sent = "All files were sent!";
                output.writeUTF(sent);

                System.out.println("Received: " + received);
                System.out.println("Sent: " + sent);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


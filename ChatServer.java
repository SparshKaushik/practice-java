// Design a program to create simple chat application using Socket Programming.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while (true) {
                line = reader.readLine();
                System.out.println("Client: " + line);
                System.out.print("Server: ");
                line = consoleReader.readLine();
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
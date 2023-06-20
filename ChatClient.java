import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while (true) {
                System.out.print("Client: ");
                line = consoleReader.readLine();
                writer.write(line);
                writer.newLine();
                writer.flush();
                line = reader.readLine();
                System.out.println("Server: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
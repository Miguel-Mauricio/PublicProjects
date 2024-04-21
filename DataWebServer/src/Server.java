import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port = 9898;

    private Socket clientSocket;

    private ServerSocket serverSocket;

    private BufferedReader input;



    public Server() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Connected at " + port);

        System.out.println("Waiting for client");
        clientSocket = serverSocket.accept();

       streams();

       while (true){

           String line = input.readLine();
           if (line.equals("/quit")){
               System.out.println("Closing...");
               break;
           }
           System.out.println(line);
       }
        clientSocket.close();

    }


    public static void main(String[] args) throws IOException {
        Server server = new Server();
    }

    public void streams() throws IOException {
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    }

}

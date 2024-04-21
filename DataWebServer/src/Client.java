import java.io.*;
import java.net.Socket;

public class Client {


    int port = 9898;

    BufferedReader inputSystem;

    BufferedReader inputServer;

    BufferedWriter out;

    Socket clientSocket = new Socket("localhost", port);


    public Client() throws IOException {

        System.out.println("Connecting to " + clientSocket);

        System.out.println("You:");
        streams();

        String line = "";


        while (!line.equals("/quit")) {
            line = inputSystem.readLine();
            out.write(line);
            out.newLine();
            out.flush();
        }

        clientSocket.close();


    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
    }

    public void streams() throws IOException {

        inputSystem = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        inputServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

}
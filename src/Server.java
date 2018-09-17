import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static int PORT = 31337;

    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(PORT);
        try {
            while (true) {
                System.out.println("Waiting for client ...");

                Socket socket = listener.accept();
                try {
                    BufferedReader inFromClient =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    DataOutputStream outToClient =
                            new DataOutputStream(socket.getOutputStream());

                    String clientSentence = inFromClient.readLine();
                    System.out.println("Received: " + clientSentence);

                    //Capitalize string received from server and return to client as response
                    String serverResponse = clientSentence.toUpperCase();

                    outToClient.writeBytes(serverResponse);

                } finally {
                    socket.close();
                }

            }
        }
        finally {
            listener.close();
        }
    }

}

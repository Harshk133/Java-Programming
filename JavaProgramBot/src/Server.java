import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
        public ServerSocket serverSocket;

        public Server(ServerSocket serversocket){
            this.serverSocket = serversocket;
        }

        public void startServer(){
            try {
                if(!serverSocket.isClosed()){
                    Socket socket = serverSocket.accept();
                    System.out.println("A New Client is connected!!");
                    ClientHandler clientHandler = new ClientHandler(socket);

                    Thread thread = new Thread(clientHandler);
                    thread.start();
                }
            }
            catch (IOException e){
                System.out.println(e);
            }
        }

        public void closeServerSocket(){
            try{
                if(serverSocket != null){
                    serverSocket.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
    }
}


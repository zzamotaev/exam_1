import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOExeption {
        ServerSocket ServerSocket = new ServerSocket(port: 8000);
        while (true){
            Socet clientSocet = ServerSocket.accept();
            System.out.println("yea");
            OutputStreamWriter writer = new OutputStreamWriter(clientSocet.getOutputStream());
            writer.write(str: "easy");
            writer.flush();
            writer.close();
        }
    }
}
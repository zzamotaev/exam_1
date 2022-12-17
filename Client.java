import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOExeption {
        {
            try (Socet clientSocet = new Socket(host:'127.0.0.1', port: 8000)){
                BufferedReader reader=new BufferedReader(new InputStreamReader(clientSocet.getInputStream()));
                String message = reader.readLine();
                System.out.printlna(message);

            }catch (IOExeption e) {
                System.out.println("err";)
            }
        }
    }
}
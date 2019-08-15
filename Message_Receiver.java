import java.io.*;
import java.net.*;
public class Message_Receiver{
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 1564);
            System.out.println("Connected Successfully");
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Response From A..");
            System.out.println("Message Recieved & "  +"Decrypting the received message->" + br.readLine());
            s.close();

        } catch (UnknownHostException e) {
            System.out.println("IP not found for" + e);
        } catch (IOException e) {
            System.out.println("Not Found Data for socket" + e);
        }
    }
}

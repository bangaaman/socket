import java.io.*;
import java.net.*;

public class Message_Sender {
    public static void main(String[] args) {
        try { ServerSocket ss=new ServerSocket(1564);
            System.out.println("Waiting For Request..");
            Socket s=ss.accept();

            System.out.println("Request Accepted...");
            PrintStream ps = new PrintStream(s.getOutputStream());
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("User A Please Enter The Message");
            ps.print(br.readLine());
            System.out.println("Encrypting the message");
            System.out.println("Sent....");            s.close();
            ss.close();

            }
        catch (Exception e){
            System.out.println("Not Found data for socket"+e);
        }
    }
}

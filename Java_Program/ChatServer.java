import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String Arr[])throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is Waiting at Port 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Client request gets Accept successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());                                 // client ke command prompt per output dikhega
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));    // client se input lene ke liye
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));                // keyboard se input lene ke liye






        String str = bobj1.readLine();
        System.out.println("Client says:"+str);
        System.out.println("Enter message for client");
        str = bobj2.readLine();
        pobj.println(str);
        
    }
}
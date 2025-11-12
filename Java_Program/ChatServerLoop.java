import java.io.*;
import java.net.*;

class ChatServerLoop
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

        System.out.println("------------------------------------------------------");
        System.out.println("-----------------Marvellous Server--------------------");
        System.out.println("------------------------------------------------------");

        String str1 = null , str2= null;

        while ((str1 = bobj1.readLine()) != null) 
        {
            System.out.println("Client Says :"+str1);
            System.out.println("Enter message for server:");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }
    }
}
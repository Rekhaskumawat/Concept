import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    public static void main(String Arr[]) throws Exception
    {
            System.out.println("Server is running...");
            ServerSocket ssobj = new ServerSocket(2100);
            System.out.println("Server is waiting at port number 2100");
            Socket sobj = ssobj.accept();
            System.out.println("Client request arrives and accepted by the server");

            DataInputStream diobj = new DataInputStream(sobj.getInputStream());
            DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

            int iNo1 = 0 , iNo2 = 0 ;

            iNo1 = diobj.readInt();
            iNo2 = diobj.readInt();

            int iSum = iNo1 + iNo2 ;
            
            doobj.writeInt(iSum);


            sobj.close();
            ssobj.close();
            System.out.println("Client application terminated");
    }
}
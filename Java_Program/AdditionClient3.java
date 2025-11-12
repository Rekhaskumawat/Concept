import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient3
{
    public static void main(String Arr[]) throws Exception
    {
            System.out.println("Client is running...");


            Socket sobj = new Socket("localhost",2100);
            System.out.println("Server successfully connected");

            DataInputStream diobj = new DataInputStream(sobj.getInputStream());
            DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

            int iNo1 = 11 , iNo2 = 10 ;

            doobj.writeInt(iNo1);
            doobj.writeInt(iNo2);



            int iSum = diobj.readInt();
            System.out.println("Addition is :"+iSum);

            sobj.close();
    
            System.out.println("Client application terminated");
        }
}
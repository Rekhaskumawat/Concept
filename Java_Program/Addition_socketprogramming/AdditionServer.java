import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    
    
    public static void main(String Arr[]) throws Exception
    {
    
            ServerSocket ssobj = new ServerSocket(2200);
            System.out.println("Server is waiting....");

            Socket sobj = ssobj.accept();
            System.out.println("Client connected...");
        

            DataInputStream diobj = new DataInputStream(sobj.getInputStream());
            DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

            while(true)
            {
            int iNo1 = 0 , iNo2 = 0 , iAns = 0 ;
            char operation = ' ';

            operation = diobj.readChar();
            iNo1 = diobj.readInt();
            iNo2 = diobj.readInt();

            switch(operation)
            {
                case '+': 
                {
                    iAns = iNo1 + iNo2;
                    break;
                }
                case '-': 
                {
                    iAns = iNo1 - iNo2;
                    break;
                }
                case '*': 
                {
                    iAns = iNo1 * iNo2;
                    break;
                }
                case '/': 
                {
                    iAns = iNo1 / iNo2;
                    break;
                }

            }
            doobj.writeInt(iAns);
            
            }
    }
            
}
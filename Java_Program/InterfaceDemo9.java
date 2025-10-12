class InterfaceDemo9
{
    public static void main(String Arr[])
    {
            Demo dobj = new Demo();
            dobj.fun();
            dobj.gun();
           // dobj.Display();           //Error
            
    }
}
interface A
{
    int ino =11;
    void fun();
    private void Display()                                  //helper function
    {
        System.out.println("inside private Display");  
    }
    default void gun()
    {
        System.out.println("inside gun");
        Display();
    }
    
}

class Demo implements A          
{
    public void fun()
    {
        System.out.println("inside  fun");      
    }
}
    
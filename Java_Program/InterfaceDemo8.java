class InterfaceDemo8
{
    public static void main(String Arr[])
    {
            Demo dobj = new Demo();
            dobj.fun();
            dobj.gun();
            
    }
}
interface A
{
    int ino =11;
    void fun();
    default void gun()
    {
        System.out.println("inside gun");
    }
}

class Demo implements A          
{
    public void fun()
    {
        System.out.println("inside  fun");      
    }
}
    
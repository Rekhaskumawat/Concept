class InterfaceDemo5
{
    public static void main(String Arr[])
    {
            Demo dobj = new Demo();
            dobj.fun();
            
    }
}
interface A
{
    void fun();
}
interface B
{
    void fun();
}
class Demo implements A, B          // multiple inheritance
{
    public void fun()
    {
        System.out.println("inside A ,B fun");
    }
}
    
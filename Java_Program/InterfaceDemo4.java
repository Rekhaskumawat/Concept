class InterfaceDemo4
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
    void fun();
}
interface B
{
    void gun();
}
class Demo implements A, B          // multiple inheritance
{
    public void fun()
    {
        System.out.println("inside A fun");
    }
    public void gun()
    {
        System.out.println("inside B gun");
    }
}
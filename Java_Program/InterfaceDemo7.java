class InterfaceDemo7
{
    public static void main(String Arr[])
    {
            Demo dobj = new Demo();
            dobj.fun();
            
    }
}
interface A
{
    int ino =11;
    void fun();
}
interface B
{
    int ino = 21;
    void fun();
}
class Demo implements A, B          // multiple inheritance
{
    public void fun()
    {
        System.out.println("inside  fun"+A.ino);      //no generates Error
    }
}
    
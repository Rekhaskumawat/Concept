class ConstructorDestructor
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

        dobj1=null;
        dobj2=null;

        System.gc();

        System.out.println("End of main");

    }
}

class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out .println("inside Default constructor");
        
    }
    public Demo(int A , int B)
    {
        System.out.println("inside Parametrised constructor");   
        
    }
    protected void finalize()
    {
        System.out.println("Inside finalize");
    }

}

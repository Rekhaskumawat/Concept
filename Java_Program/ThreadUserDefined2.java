class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method");
    }
}
class ThreadUserDefined2
{
    public static void main(String Arr[])
    {
        System.out.println("inside main thread");
       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();

       dobj1.start();
       dobj2.start();

       System.out.println("end of main thread");
    }
}
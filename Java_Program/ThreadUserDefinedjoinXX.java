class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method : "+Thread.currentThread().getName());
    }
}
class ThreadUserDefinedjoinXX
{
    public static void main(String Arr[]) 
    {
        System.out.println("inside main thread");
       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();

       dobj1.setName("first");
       dobj2.setName("second");



       dobj1.start();
       dobj2.start();
       //checked Exception
         try
        {
            dobj1.join();
            dobj2.join();

        }

        catch(InterruptedException iobj)
        {
            System.out.println(iobj);
        }       
       System.out.println("end of main thread");
    }
}
class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method : "+Thread.currentThread().getName());
    }
}
class ThreadUserDefinedJoinSerial
{
    public static void main(String Arr[]) 
    {
        System.out.println("inside main thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

       dobj1.setName("first");
       dobj2.setName("second");

       //checked Exception
         try
        {
            dobj1.start();
            dobj1.join();
            System.out.println("End of first thread");

            dobj2.start();
            dobj2.join();
            System.out.println("End of second thread");

        }

        catch(InterruptedException iobj)
        {
            System.out.println(iobj);
        }       
       System.out.println("end of main thread");
    }
}
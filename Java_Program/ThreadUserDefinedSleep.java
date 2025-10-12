//code to demonstrate the thread scheduling
class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i = 1; i <= 5; i++)
        {
        System.out.println("inside run method : "+Thread.currentThread().getName());

        }
    }
}
class ThreadUserDefinedSleep
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
            dobj2.start();
            
            dobj2.join();
            dobj1.join();
           

        }

        catch(InterruptedException iobj)
        {
            System.out.println(iobj);
        }       
       System.out.println("end of main thread");
    }
}
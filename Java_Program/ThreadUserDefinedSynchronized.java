class TablePrinter
{
    public void printtable(int n)
    {
        int i = 0;
        for(i= 1;i<=10; i++)
        {
            System.out.println("Name:" + Thread.currentThread().getName()+":" +n*i);
        }
    }
}
class Demo extends Thread
{
    public void run()
    {
    }
}
class ThreadUserDefinedSynchronized
{
    public static void main(String Arr[]) 
    {
       TablePrinter tobj = new TablePrinter();
       tobj.printtable(5);
       tobj.printtable(4);

    }
}
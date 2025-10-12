class ThreadDemo2
{
    public static void main(String Arr[])
    {
        System.out.println("Inside main method");
        Thread tobj = Thread.currentThread();
        String Name = tobj.getName();
        System.out.println("Name of current thread is: "+Name);
    }
}
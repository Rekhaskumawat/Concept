class ThreadPriority
{
    public static void main(String Arr[])
    {
        System.out.println("Inside main method");
        Thread tobj = Thread.currentThread();
        String Name = tobj.getName();
        System.out.println("Name of current thread is: "+Name);
        int priority = tobj.getPriority();
        System.out.println("priority of current thread is :"+priority);
        tobj.setPriority(10);
        priority = tobj.getPriority();
        System.out.println("priority of current thread is :"+priority);
    }
}
class ThreadDemo1
{
    public static void main(String Arr[])
    {
        System.out.println("Inside main method");

        String Name = Thread.currentThread().getName();

        System.out.println("Name of current thread is: "+Name);
    }
}
class Single
{
    public static void main(String arr[]) 
    {
        Base bobj = new Base();

        Derived dobj = new Derived();

        bobj.fun();
        dobj.fun();
        dobj.Gun();
        
    }
}
class Base              //8bytes
{
    public int i , j;

    public void fun()
    {
        System.out.println("Inside Base fun\n");
    }

}
class Derived extends Base          //12bytes
{
    public int x ;

    public void Gun()
    {
        System.out.println("Inside Derived Gun\n");
    }
}


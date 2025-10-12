class Base
{
    public int i , j;
}
class Derived extends Base
{
    public int x;
}
class RMDDemo1
{
    public static void main(String Arr[])
    {
        Base bp1 = new Base();      //nocasting
        Derived dp1 = new Derived();       //nocasting
        Base bp2 = new Derived();           // upcasting
        Derived dp2 = new Base();           //downcasting   Error
    }
}

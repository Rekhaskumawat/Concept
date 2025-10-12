class InterfaceDemo3
{
    public static void main(String Arr[])
    {
        System.out.println(Demo.no);   //no is public and Static
        //Demo.no=12;               //no is final

        Hello hobj = new Hello();
        hobj.Display();       
    }
}
interface Demo
{
    int no = 11;            //public static final

    void Display();
    
    
}
class Hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Display");
    }
}

class StaticBlocks
{
    public static void main(String Arr[])
    {
        
        System.out.println("inside main");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();

        
    }
}
class Demo
{
    public int i;           //instance variable
    static public int j ;            //class variable

    static
    {
        j=21;
        System.out.println("inside static block");
        
    }
    public Demo()
    {
        this.i = 11;
        System.out.println("inside constructor");
    
    }
   
}
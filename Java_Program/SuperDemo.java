class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello constructor");
        this.i = no+1;
    }
    public void Display()
    {
        System.out.println("Inside Hello Display");
    }

}
class Demo extends Hello
{
    public int i;

    public Demo(int A)
    {
        super(A);                                           //first use
        this.i=A;                  
        System.out.println("Inside Demo Constructor ");
    }
    
    public void Display()
    {
        int i = 0;
        System.out.println("Inside Display:"+i);            //0
        System.out.println("Inside Display:"+this.i);       //51
        System.out.println("Inside Display:"+super.i);      //52   second use
        super.Display();                                    // third use
    }
}

class SuperDemo
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}
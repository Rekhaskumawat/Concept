class FinalData4
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo(11,21);
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
       // dobj.j++;                                   //Error
    }
}
class Demo
{
    public int i;
    final public int j;
    Demo(int a , int b)
    {
        this.i =a;
        this.j =b;
    }
    
}



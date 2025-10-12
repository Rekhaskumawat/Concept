class FinalData1
{
    public static void main (String Arr[])
    {
        Demo dobj = new Demo();
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        dobj.j++;                                   //Error
    }
}
class Demo
{
    public int i;
    final public int j;
    Demo()
    {
        this.i = 11;
        this.j = 21;
    }
}


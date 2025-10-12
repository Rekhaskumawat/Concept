class Demo
{
    public int division(int iNo1 , int iNo2)throws ArithmeticException
    {
        int iAns = 0;
        iAns = iNo1/iNo2;
        return iAns;
    }
}
class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo();
        int iret = 0;

        try
        {
        iret = obj.division(11, 0);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("inside catch:"+aobj);
        }
        System.out.println("Division is :"+iret);
    }
}
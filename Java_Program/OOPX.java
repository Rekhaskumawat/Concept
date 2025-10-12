class OOPX
{
    public static void main(String Arr[])
    {
        
        Arithematic dobj1 = new Arithematic(11,10);
        int iRet = 0;
        iRet = dobj1.addition();
        System.out.println("Addition is:"+iRet);

        iRet = dobj1.substraction();
        System.out.println("Substraction is :"+iRet);

        dobj1= null;

    }
}

class Arithematic
{
    public int iNo1;
    public int iNo2;

    public Arithematic()
    {
        
        this.iNo1 = 0;
        this.iNo2 = 0;
    }
    public Arithematic(int A , int B)
    {
        
        this.iNo1 = A;
        this.iNo2 = B;
    }
    public int addition()
    {
        int iAns = 0;
        iAns = this.iNo1 + this.iNo2;   
        return iAns;
    }
    public int substraction()
    {
        int iAns = 0;
        iAns = this.iNo1 - this.iNo2;   
        return iAns;
    }

}

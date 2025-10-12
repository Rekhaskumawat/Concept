class AbstractDemo2
{
    public static void main(String Arr[])
    {
        
        Base bp = new Derived();
        
        int iRet =0;

        iRet = bp.Addition(11,10);
        System.out.println("Addition:\n"+iRet);

         iRet = bp.Substraction(11,10);
        System.out.println("Substraction:\n"+iRet);

         //iRet = bp.Multiplication(11,10);
        //System.out.println("Multiplication:\n"+iRet);
        
    }
}
abstract class Base                                               //Error
{
    public int i , j;

        public int Addition(int A ,int B)
        {
            return A+B;
        }
        abstract public int Substraction(int A ,int B);

   
}
class Derived extends Base    
{
    public int x;
     
     public int Substraction(int A ,int B)
    {
        return A-B;
    }
    public int Multiplication(int A, int B)
    {
            return A*B;
    }
}


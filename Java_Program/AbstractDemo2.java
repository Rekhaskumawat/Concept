class AbstractDemo2
{
    public static void main(String Arr[])
    {
        
        Base bp = new Base();           
        
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
class Derived extends Base    //Error
{
   public int x;
     
}


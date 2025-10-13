// concept of use of Object class function (hashcode,getclass)
class Demo
{

}
class ObjectClass1
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo();
        System.out.println(dobj.hashCode());
        System.out.println(dobj.getClass());
    }
}
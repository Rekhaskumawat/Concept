/*
    conept of pure virtual  function
     and providing defination to the abstrat function
*/
#include<iostream>
using namespace std;

class Base
{
    public:
        int i , j ;
        int Addition (int A , int B)                //concrete
        {
            return A+B;
        }
        virtual int Substraction (int A ,int B)=0;         //abstract
        

        
};

class Derived : public Base
{
    public:
     int x;
        
    int Substraction (int A ,int B)
    {
        return A-B;
    }
    int Multiplication (int A ,int B)
    {
        return A*B;
    }

};

int main()
{
    

    Base*bp = new Derived();           //upcasting
    int iRet = 0;
    iRet = bp->Addition(11,10);
    cout<<"Addition:"<<iRet<<"\n";
    iRet = bp->Substraction(11,10);
    cout<<"Substraction:"<<iRet<<"\n";
    //iRet = bp->Multiplication(11,10);
   

    
    return 0;
}
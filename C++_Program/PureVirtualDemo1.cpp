/*
    conept of pure virtual  function
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
        virtual int Substraction (int A ,int B)=0;      //abstract
        

        
};

class Derived : public Base             //Error
{
    public:
     int x;
        
    
};

int main()
{
    

    Base*bp2 = new Derived();           //upcasting
    
   

    
    return 0;
}
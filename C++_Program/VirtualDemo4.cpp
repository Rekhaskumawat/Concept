/*      
        concept of upcasting , redefination , overriding
        checking the size of the class 
        due to virtual function first 8 bytes are reserved for
          special pointer which is called as VPTER

*/
#include<iostream>
using namespace std;

class Base
{
    public:
        int i , j ;

        void fun()
        {
            cout<<"Inside Base Fun"<<"\n";
        }
        void gun()
        {
            cout<<"Inside Base gun"<<"\n";
        }
        virtual void sun()
        {
            cout<<"Inside Base sun"<<"\n";
        }
        virtual void bun()
        {
            cout<<"Inside Base bun"<<"\n";
        }
};

class Derived : public Base
{
    public:
        int x;
        void gun()
        {
            cout<<"Inside Derived gun"<<"\n";
        }
        void sun()
        {
            cout<<"Inside Derived sun"<<"\n";
        }
        void run()
        {
            cout<<"Inside Derived run"<<"\n";
        }
        void mun()
        {
            cout<<"Inside Derived mun"<<"\n";
        }


};

int main()
{
    

    cout<<sizeof(Base)<<"\n";   //16bytes
    cout<<sizeof(Derived)<<"\n";    //2bytes 
   
    return 0;
}
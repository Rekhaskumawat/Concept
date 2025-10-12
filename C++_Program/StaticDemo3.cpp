#include<iostream>
using namespace std;

class Demo
{
    public:
        int i ;
        int j ;
        static int x ;
        
        Demo()
        {
            this->i = 0;
            this->j = 0;
        }

        Demo(int A, int B)
        {
            this->i = A;
            this->j = B;

        }

        void fun()           // void fun(Demo*const this)
        {
            cout<<"Inside fun\n";
            cout<<"Value of i is:"<<this->i<<"\n";
            cout<<"Value of j is:"<<this->j<<"\n";
            cout<<"Value of x is:"<<x<<"\n";

        }

        static void gun()   // static void gun()
        {
            cout<<"Inside gun\n";
           // cout<<i<<"\n";                Not Allowed
           // cout<<j<<"\n";                Not Allowed
            cout<<x<<"\n";
        }



};

int Demo::x = 11;



int main()
{
    Demo::gun();
    cout<<"Value of X is:"<<Demo::x<<"\n";

    Demo obj(10,20);

    obj.fun();
    obj.gun();           // Demo::gun();

    cout<<"size of obj is : "<<sizeof(obj)<<"\n";

    return 0;
}
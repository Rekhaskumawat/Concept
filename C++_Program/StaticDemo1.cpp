// delcatration of static characterstic and functions
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
            cout<<"Inside Fun\n";
        }

        static void gun()   // static void gun()
        {
            cout<<"Inside Fun\n";
        }



};

int Demo::x = 11;



int main()
{
    Demo::gun();
    cout<<"Value of X is:"<<Demo::x<<"\n";
    return 0;
}
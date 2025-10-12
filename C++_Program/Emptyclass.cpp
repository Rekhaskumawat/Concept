#include<iostream>
using namespace std;

class Demo
{
    public:
        void Display()
        {
            cout<<"Inside Demo";
        }
};
int main()
{
    Demo dobj;

    cout<<sizeof(dobj);         //1 bytes
    return 0;
}
#include<iostream>
using namespace std;
int main()
{
    int length = 0;
    int*Arr = NULL;

    cout<<"Enter the number of elements:";
    cin>>length;

    //step 1: memory allocation
    Arr = new int[length];
    if(Arr==NULL)
    {
        cout<<"unable to allocate the memory";

    }
    else
    {
        cout<<"Memory allocated successfully";
    }

    //step2 : use the memory
    //step 3 : delete the memory

    delete []Arr;

    return 0;
}
#include<stdio.h>
int main()
{
    char cValue='S';
    int iValue=11;
    float fValue=90.78;
    double dValue=98.564323;

    printf("size of character is:%lu\n",sizeof(cValue));
    printf("size of integer is:%lu\n",sizeof(iValue));
    printf("size of float is:%lu\n",sizeof(fValue));
    printf("size of double is:%lu\n",sizeof(dValue));

    printf("address of cValue is:%lu\n",&cValue);
    printf("address of iValue is:%lu\n",&iValue);
    printf("address of fValue is:%lu\n",&fValue);
    printf("address of dValue is:%lu\n",&dValue);
    

    return 0;
}
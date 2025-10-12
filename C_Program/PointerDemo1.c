#include<stdio.h>
int main()
{
     
    int iValue =11;
    char cValue ='M';

    int*iptr = &iValue;
    char*cptr = &cValue;

    printf("Size of iPtr:%lu\n",sizeof(iptr));             //8
     printf("Size of cPtr:%lu\n",sizeof(cptr));             //8

    
    
    return 0;

}
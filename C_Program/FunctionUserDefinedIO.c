#include<stdio.h>

int Addition(int iNo1 ,int iNo2)
{
    int iSum=0;
    iSum=iNo1+iNo2;
    return iSum;
}
int main()
{

    int iValue1=0;
    int iValue2=0;
    int iAns=0;

    printf("enter value of iValue1:");
    scanf("%d",&iValue1);

    printf("enter value of iValue2:");
    scanf("%d",&iValue2);

    iAns=Addition(iValue1,iValue2);
    printf("Addition of number: %d\n",iAns);

    return 0;
}
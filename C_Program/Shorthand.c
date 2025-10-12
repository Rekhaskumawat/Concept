#include<stdio.h>
int main()
{
    int i=10;
    int j=10;
    int ians=0 , jans=0;
    ians=i++;
    jans=++j;

    printf("value of i :%d\n", i);
    printf("value od ians:%d\n",ians);

    printf("value of j :%d\n", j);
    printf("value od jans:%d\n",jans);

    return 0;
}
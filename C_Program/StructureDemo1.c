#include<stdio.h>

struct Demo
{
    int i;
    float f;
    int j;

};   
int main()
{
    struct Demo obj;
    printf("size of Demo is:%lu\n", sizeof(struct Demo));
    printf("size of object is:%lu",sizeof(obj));
    return 0;
}
#include<stdio.h>

struct Demo
{
    int i;
    float f;

};

struct Hello
{
    int no;
    float marks;
    struct Demo obj;        //nested
};
int main()
{
    printf("size of Hello Structure is:%lu\n",sizeof(struct Hello));
    return 0;
}
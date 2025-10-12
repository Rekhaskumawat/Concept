#include<stdio.h>
#include<stdlib.h>               //for malloc(),calloc(),realloc(),free()
int main()
{
    int length = 0;
    int*Arr = NULL;

    printf("Enter the number of elements:\n");
    scanf("%d",&length);

    // step 1: allocate the memory
    Arr=(int*)calloc(length ,sizeof(int));
    if(Arr==NULL)
    {
        printf("Unable to allocate the memory");
    }
    else
    {
        printf("Memory allocated successfully");
    }
    // step 2: use the memory

    // step 3: free the memory

    free(Arr);

    return 0;
}
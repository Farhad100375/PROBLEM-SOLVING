#include<stdio.h>
int main()
{
    int k,n,w,sum=0;
    scanf("%d %d %d" ,&k ,&n ,&w);
    for(int i=1; i<=w;i++)
    {
        sum+=(k*i);
    }
    if(sum<=n)
        printf("0");
    else
        printf("%d",sum-n);
    return 0;
}

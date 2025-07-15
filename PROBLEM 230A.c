#include<stdio.h>
int main()
{
    int s,n,count=0;
    scanf("%d %d",&s ,&n);
    int x[n], y[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d" ,&x[i]);
        scanf("%d",&y[i]);
    }
    for(int i = 0; i < n-1; i++)
    {
        for(int j = 0; j < n-1-i; j++)
        {
            if(x[j] > x[j+1])
            {
                int temp = x[j];
                x[j] = x[j+1];
                x[j+1] = temp;

                temp = y[j];
                y[j] = y[j+1];
                y[j+1] = temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
       if(s>x[i])
       {
           s+=y[i];
       }
       else
       {
            printf("NO");
            return 0;
       }

    }
    printf("YES");
    return 0;

}

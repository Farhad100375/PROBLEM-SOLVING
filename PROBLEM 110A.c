#include<stdio.h>
int main()
{
    long long int n;
    int C=0;
    scanf("%lld", &n);
    while(n!=0)
    {
        int mod=n%10;
        if(mod==4 || mod==7)
        {
           C++;
        }
        n/=10;
    }
    if(C==7 || C==4)
    {
        printf("YES");
    }
    else
        printf("NO");
    return 0;
}

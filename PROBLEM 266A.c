#include<stdio.h>
int main()
{
    int n,count=0;
    char s[51];
    scanf("%d",&n);
    getchar();
    fgets(s, n+1 , stdin);
    for(int i=0 ;i<(n-1); i++)
    {
        if(s[i] == s[i+1])
            count++;
    }
    printf("%d",count);
}

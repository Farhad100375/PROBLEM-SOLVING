#include<stdio.h>
int main()
{
    int n,a=0,d=0;
    scanf("%d",&n);
    getchar();
    char s[n+1];
    fgets(s,n+1,stdin);
    for(int i=0; s[i]!='\0';i++)
    {
        if(s[i]=='A')
            a++;
        else
            d++;
    }
    if(a>d)
        printf("Anton");
    else if(d>a)
        printf("Danik");
    else
        printf("Friendship");
    return 0;
}

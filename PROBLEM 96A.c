#include<stdio.h>
int main()
{
    char a[101];
    int n=1;
    fgets(a,100,stdin);
    for(int i=1; a[i] != '\0'; i++)
    {
        if(a[i]==a[i+1])
        {
            n++;
            if(n>=7)
            {
                printf("YES");
                return 0;
            }
        }
        else
            n=1;
    }
    printf("NO");
    return 0;
}


#include<stdio.h>
int main()
{
    char s[101];
    int j=0;
    fgets(s, sizeof(s), stdin);
    char cha[6]="hello";
    for(int i=0;s[i]!='\0';i++)
    {
        if(cha[j]==s[i])
        {
            j++;
        }
        if(j == 5)
            break;
    }
    if(j==5)
        printf("YES");
    else
        printf("NO");
        return 0;
}

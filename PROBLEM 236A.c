#include<stdio.h>
int main()
{
    char nam[100];
    scanf("%s",nam);
    int c=strlen(nam);
    for(int i=0;i<c-1; i++)
    {
        for(int j=i+1; j<c;j++)
        {
            if(nam[i]==nam[j])
                c--;
        }
    }
    if(c%2==0)
        printf("CHAT WITH HER!");
    else
        printf("IGNORE HIM!");
}

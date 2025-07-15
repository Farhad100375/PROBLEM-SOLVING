#include<stdio.h>
int main()
{
    char str1[100], str2[100];
    scanf("%s",&str1);
    scanf("%s",&str2);
    int com=strcasecmp(str1,str2);
    printf("%d",com);
}

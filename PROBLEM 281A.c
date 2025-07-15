#include<stdio.h>
#include <string.h>
#include <ctype.h>
int main()
{

    char a[1001];
    int Len;
    scanf("%s",a);
    Len=strlen(a);
    a[0]=toupper(a[0]);
    printf("%s",a);
}

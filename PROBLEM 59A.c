#include<stdio.h>
int main()
{
    char s[101];
    int u=0,l=0;
    fgets(s, 101,stdin);
    for(int i=0; s[i]!='\0';i++)
    {
        if(isupper(s[i]))
            u++;
        else
            l++;
    }
    if (u > l) {
        for (int i = 0; s[i] != '\0'; i++) {
            s[i] = toupper(s[i]);
        }
    } else {
        for (int i = 0; s[i] != '\0'; i++) {
            s[i] = tolower(s[i]);
        }
    }
    printf("%s", s);
    return 0;
}

#include <stdio.h>
int main()
{
    char nam[101];
    scanf("%s", nam);
    int freq[26] = {0};
    for (int i = 0; nam[i] != '\0'; i++)
    {
        freq[nam[i] - 'a'] = 1;
    }
    int count = 0;
    for (int i = 0; i < 26; i++)
    {
        count += freq[i];
    }
    if (count % 2 == 0)
        printf("CHAT WITH HER!\n");
    else
        printf("IGNORE HIM!\n");

    return 0;
}

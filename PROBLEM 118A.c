#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char a[101], b[202];
    int j = 0;

    scanf("%s", a);

    for (int i = 0; a[i] != '\0'; i++) {
        char ch = tolower(a[i]);
        if (ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e' || ch == 'u' || ch == 'i')
            continue;
        b[j++] = '.';
        b[j++] = ch;
    }

    b[j] = '\0';
    printf("%s\n", b);

    return 0;
}

#include<stdio.h>
int main()
{

    int n,sumx =0,sumy =0,sumz =0;
    scanf("%d",&n);
    int a[n][3];
    for(int i=0;i<n;i++ )
    {
        for(int j=0; j<3;j++)
        {
            scanf("%d",&a[i][j]);
        }
            sumx+=a[i][0];
            sumy+=a[i][1];
            sumz+=a[i][2];

    }
    if(sumx == 0 && sumy == 0 && sumz == 0)
        printf("YES");
    else
        printf("NO");

}

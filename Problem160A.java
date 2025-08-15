import java.util.Scanner;
public class Problem160A{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0; i<n; i++)
        {
            a[i]=input.nextInt();
            sum+=a[i];
        }
        int temp;
        for(int i=0; i<n; i++)
        {
            for(int j=i;j<n; j++)
            {
                if(a[j]>a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        int my=0,count=0;
        for(int i=0; i<n; i++)
        {
            my+=a[i];
            sum-=a[i];
            count++;
            if(my>sum)
            {
                break;
            }
        }
        System.out.println(count);
        
    }
}
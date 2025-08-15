import java.util.Scanner;
public class Problem116A{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]= input.nextInt();
            b[i]= input.nextInt();
            sum = sum - a[i] + b[i];
            if(sum>max)
            max = sum;
        }
        System.out.println(max);
        return;
    }
}
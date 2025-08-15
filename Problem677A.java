import java.util.Scanner;
public class Problem677A{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int h=input.nextInt();
        int[] a= new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
            if(a[i]>h)
            c+=2;
            else 
            c++;
        }
        System.out.println(c);
        
    }
}
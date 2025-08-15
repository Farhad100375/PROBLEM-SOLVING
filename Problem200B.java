import java.util.Scanner;
public class Problem200B{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double[] p= new double[n];
        double sum=0;
        for(int i=0; i<n; i++)
        {
            p[i]=input.nextDouble();
            sum+=p[i];
        }
        System.out.println((sum/n));
    }
}
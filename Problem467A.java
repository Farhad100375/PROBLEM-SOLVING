import java.util.Scanner;

public class Problem467A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p= new int[n];
        int[] q= new int[n];
        int count=0;
        for(int i=0; i<n; i++)
        {
            p[i]= input.nextInt();
            q[i]= input.nextInt();
            if(q[i] - p[i]>=2)
            {
                count++;
            }
            
        }
        System.out.println(count);
    }
}
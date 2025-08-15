import java.util.Scanner;

public class Problem136A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n];
        int[] f= new int[n];
        for(int i=0; i<n; i++)
        {
            p[i]= input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f[p[i] - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }
    }
}
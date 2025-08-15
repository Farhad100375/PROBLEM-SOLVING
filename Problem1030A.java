import java.util.Scanner;
public class Problem1030A{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int[] v= new int[n];
        for(int i=0; i<n; i++)
        {
            v[i] =input.nextInt();
            if(v[i]==1)
            {
            System.out.println("HARD");
            return;
            }
        }
        System.out.println("EASY");
    }
}
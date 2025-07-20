import java.util.Scanner;
public class Problem110A{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int C=0;
        while(n!=0)
        {
            long mod = n%10;
            if(mod==7 || mod==4)
            C++;
            n/=10;
        }
        if(C==7 || C==4)
        {
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
}
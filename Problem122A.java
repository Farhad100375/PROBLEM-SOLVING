import java.util.Scanner;
public class Problem122A{
    public static boolean lucky(int num){
        while(num!=0)
        {
            int digit =num%10;
            if(digit !=4 && digit !=7)
            return false;
            num/=10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        boolean Lucky=false;

        for (int i = 1; i <= n; i++) {
            if (lucky(i) && n % i == 0) {
                Lucky = true;
                break;
            }
        }

        if(Lucky)
        {
            System.out.println("YES");
        }
        
        else
            System.out.println("NO");
    }
}
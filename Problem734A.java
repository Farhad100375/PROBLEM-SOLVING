import java.util.Scanner;
public class Problem734A{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        int a=0,d=0;
        String s=input.nextLine();
        for(int i=0; i<n;i++)
        {
            if (s.charAt(i) == 'A')
            a++;
            else
            d++;
        }
        if(a>d)
        System.out.println("Anton");
        else if(d>a)
        System.out.println("Danik");
        else
        System.out.println("Friendship");
    }
}
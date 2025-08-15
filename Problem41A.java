import java.util.Scanner;

public class Problem41A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        int a=t.length()-1;
        for (int i = 0; i < a; i++) {
            char temp = t[i];
            t[i] = t[a - i];
            t[a - i] = temp;
        }
        
            if (s.equals(c))
                System.out.println("YES");
            else
            System.out.println("NO");
    }
}

import java.util.Scanner;

public class Problem318A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();
        
        long oddCount = (n + 1) / 2; 
        
        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - oddCount));
        }
    }
}

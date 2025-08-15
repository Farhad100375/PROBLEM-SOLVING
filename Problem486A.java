import java.util.Scanner;

public class Problem486A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long result;

        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -(n + 1) / 2;
        }

        System.out.println(result);
    }
}

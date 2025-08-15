import java.util.Scanner;

public class Problem61A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1 = input.next();
        String n2 = input.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == n2.charAt(i)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }

        System.out.println(result.toString());
    }
}

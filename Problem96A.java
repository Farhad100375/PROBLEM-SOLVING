import java.util.Scanner;

public class Problem96A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int n = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                n++;
                if (n >= 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                n = 1;
            }
        }

        System.out.println("NO");
    }
}

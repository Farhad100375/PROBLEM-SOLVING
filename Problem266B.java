import java.util.Scanner;

public class Problem266B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        input.nextLine(); 
        String s = input.nextLine();
        char[] u = s.toCharArray();

        for (int I = 0; I < t; I++) {
            for (int i = 0; i < n - 1; i++) {
                if (u[i] == 'B' && u[i + 1] == 'G') {
                    char temp = u[i];
                    u[i] = u[i + 1];
                    u[i + 1] = temp;
                    i++;
                }
            }
        }

        System.out.println(new String(u));
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Problem228A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] s = new int[4];

        for (int i = 0; i < 4; i++) {
            s[i] = input.nextInt();
        }

        Arrays.sort(s); 

        int Count = 1; 
        for (int i = 1; i < 4; i++) {
            if (s[i] != s[i - 1]) {
                Count++;
            }
        }

        System.out.println(4 - Count);
    }
}

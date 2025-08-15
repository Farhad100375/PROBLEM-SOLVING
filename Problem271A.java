import java.util.Scanner;

public class Problem271A {
    public static boolean allDigitsDifferent(int year) {
        int d1 = year % 10;
        year /= 10;
        int d2 = year % 10;
        year /= 10;
        int d3 = year % 10;
        year /= 10;
        int d4 = year % 10;
        return (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        
        while (true) {
            y++;
            if (allDigitsDifferent(y)) {
                System.out.println(y);
                break;
            }
        }
    }
}
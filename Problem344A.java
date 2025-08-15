import java.util.Scanner;

public class Problem344A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] m= new String[n];
        for (int i=0; i<n;i++)
        {
            m[i] = input.next();
        }
        int count=1;
        for(int i=0; i<n-1; i++)
        {
            if(!m[i].equals(m[i+1]))
            count++;
        }
        System.out.println(count);
        
    }
}
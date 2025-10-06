import java.util.Scanner;

public class SumMinimisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            if (sum%n == 0) {
                System.out.println(sum);
            }
        }
        
        sc.close();
    }
}

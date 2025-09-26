import java.util.Scanner;
public class SumMinimisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if (n == 1) {
                System.out.println(sum); 
                continue;
            }
            boolean allEqual = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allEqual = false;
                    break;
                }
            }
            if (!allEqual && n == a.length) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
            }
        }
        sc.close();
    }
}

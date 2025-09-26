import java.util.*;
public class IncrementalSubarray {
    private static int solve(int n, int[] a) {
        int m = a.length;
        int minVal = a[0], maxVal = a[0];
        for (int i = 1; i < m; i++) {
            if (a[i] < minVal) minVal = a[i];
            if (a[i] > maxVal) maxVal = a[i];
        }
        if (maxVal > n) return 0;
        if (m == 1) {
            return n - maxVal + 1;
        }
        boolean hasIncrement = false;
        for (int i = 1; i < m; i++) {
            if (a[i] < a[i - 1] || a[i] > a[i - 1] + 1) {
                return 1;
            }
            if (a[i] == a[i - 1] + 1) hasIncrement = true;
        }

        if (!hasIncrement) {
            return 1;
        }

        return n - maxVal + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) a[i] = sc.nextInt();
            System.out.println(solve(n, a));
        }
        sc.close();
    }
}

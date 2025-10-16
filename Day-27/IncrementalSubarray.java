import java.util.*;

public class IncrementalSubarray {
    private static long solve(int n, int[] a) {
        int m = a.length;
        int maxVal = 0;
        for (int val : a) maxVal = Math.max(maxVal, val);

        if (maxVal > n) return 0;
        if (m == 1) return n - a[0] + 1;

        boolean reset = false;
        for (int i = 1; i < m; i++) {
            if (a[i] < a[i - 1] && a[i] != 1) {
                reset = true;
                break;
            }
            if (a[i] > a[i - 1] + 1) {
                reset = true;
                break;
            }
        }

        if (reset) return 1;  
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

import java.util.Scanner;

public class TwoTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            String u = sc.next();

            int clashes = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) clashes++;
            }
            for (int i = 0; i < m - 1; i++) {
                if (u.charAt(i) == u.charAt(i + 1)) clashes++;
            }

            if (s.charAt(n - 1) == u.charAt(m - 1)) clashes++;

            if (clashes <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

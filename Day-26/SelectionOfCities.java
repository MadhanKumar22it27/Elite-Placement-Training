import java.util.Scanner;
public class SelectionOfCities {
    static final long MOD = 1000000007;
    static long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = (power(2, n) - 1 + MOD) % MOD;
            System.out.println(ans);
        }
        sc.close();
    }
}

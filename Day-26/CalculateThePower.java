import java.util.Scanner;

public class CalculateThePower {
    public static void main(String[] args) {
        final long count = 1000000007;
       Scanner sc = new Scanner(System.in);
       long base = sc.nextLong();
       long power = sc.nextLong();
       sc.close();
       long result = 1;
        while (power > 0) {
            if (power % 2 == 1) result = (result*base)%count;
            base = (base*base)%count;
            power /= 2;
        }
       System.out.print(result);
    }
}

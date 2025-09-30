import java.util.Scanner;

public class DigitMinimisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n < 100 && n > 9) {
                System.out.println(n%10);
            }
            else{
                int min = n%10;
                while (n != 0) {
                    int last = n%10;
                    n/=10;
                    if (last < min) {
                        min = last;
                    }
                }
                System.out.println(min);
            }
        }
        sc.close();
    }
}

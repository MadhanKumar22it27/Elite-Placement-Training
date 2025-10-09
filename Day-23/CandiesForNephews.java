import java.util.Scanner;
public class CandiesForNephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int candies = sc.nextInt();
            if (candies%3 == 0) {
                System.out.println(0);
            }
            else{
                System.out.println(3-(candies%3));
            }
        }
        sc.close();
    }
}

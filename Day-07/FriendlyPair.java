import java.util.Scanner;
public class FriendlyPair {
    public static int sum(int a){
        int count=0;
        for (int i = 1; i <= a; i++) {
            if (a%i == 0) {
                count += i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int sum1 = sum(num1);
        int sum2 = sum(num2);
        if ((sum1/num1) == (sum2/num2)) {
            System.out.println("Friendly Pair");
        }
        else{
            System.out.println("Not Friendly Pair");
        }
    }
}

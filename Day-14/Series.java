import java.util.Scanner;
public class Series {
    public static int exponent(int base,int power){
        int count=1;
        for (int i = 0; i < power; i++) {
            count *=base;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (exponent(2, j)*b);
                System.out.println(sum+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

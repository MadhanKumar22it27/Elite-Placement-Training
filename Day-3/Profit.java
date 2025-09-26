import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int sell = sc.nextInt();
        int cost = sc.nextInt();
        sc.close();
        System.out.println((sell*quantity)-((cost*quantity)+100));
    }
}

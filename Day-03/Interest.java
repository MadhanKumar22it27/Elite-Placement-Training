import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float principal = sc.nextFloat();
        float rate = sc.nextFloat();
        float year = sc.nextFloat();
        sc.close();

        System.out.println("\n");
        System.out.printf("%.2f\n",(principal*rate*year)/100);
        System.out.printf("%.2f\n",principal+((principal*rate*year)/100));
        System.out.printf("%.2f\n",(2.00/100.00)*((principal*rate*year)/100));
        System.out.printf("%.2f",(principal+((principal*rate*year)/100))-((2.00/100.00)*((principal*rate*year)/100)));
    }
}
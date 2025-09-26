import java.util.Scanner;
import java.lang.Math;;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            if (i%2 != 0) {
                System.out.print((int)Math.pow(i, 3)+" ");
            }
            else{
                System.out.print((int)Math.pow(i, 2)+" ");
            }
        }
    }
}
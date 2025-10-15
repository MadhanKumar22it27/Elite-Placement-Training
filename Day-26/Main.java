import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
}

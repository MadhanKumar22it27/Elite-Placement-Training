import java.util.Scanner;
public class Strong {
    static int factorial(int a){
        if (a == 1) {
            return a;
        }
        else{
            return a*factorial(a-1);
        }
    }
    static int digit(int num1){
        int strong=0;
        while (num1 > 0) {
            int temp = num1 % 10;
            num1 /= 10;
            strong += factorial(temp);
        }
        return strong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num == digit(num)) {
            System.out.println("It is Strong Number");
        }
        else{
            System.out.println("It is not Strong Number");
        }
    }
}

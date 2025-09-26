import java.util.Scanner;
public class Practice4 {
    public static void NumberPrint(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void MultiplyPrint(int num){
        int i=1;
        while (i<=10) {
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }
    }
    public static void sumOfNumbers(int num){
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of first "+num+" numbers is "+sum);
    }
    public static void evenNumbersPrint(int num){
        int i=0;
        System.out.println("\n");
        do {
            if(i%2 == 0){
                System.out.println(i);    
            }
            i++;
        } while (i<=num);
    }
    public static void factorial(int num){
        System.out.println("\n");
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact = fact*(i+1);
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // NumberPrint();
        // MultiplyPrint(num);
        // sumOfNumbers(num);
        // evenNumbersPrint(num);
        factorial(num);
    }
}

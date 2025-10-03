import java.util.Scanner;
public class Practice1 {
    public static void isPositive(int num){
        if (num > 0) {
            System.out.println(num+" is positive");
        }
        else{
            System.out.println(num+" is not positive");
        }
    }
    public static void evenOrOdd(int num){
        if (num%2==0) {
            System.out.println(num+" is Even number");
        }
        else{
            System.out.println(num+" is Odd number");
        }
    }
    public static void largest(int a, int b){
        if (a > b) {
            System.out.println(a + " is greater than "+b);
        }
        else if (a == b) {
            System.out.println("They are Equal");
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void isleap(int year){
        if (year%4 == 0) {
            if (year%100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year+" is a leap year");
                }
                else{
                    System.out.println(year+" is not a leap year");
                }
            }
            else{
                System.out.println(year+" is a leap year");
            }
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
    public static void voteEligible(int age){
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int year = sc.nextInt();
        sc.close();
        // isPositive(num);
        // evenOrOdd(num);
        // largest(num1, num2);
        // isleap(year);
        voteEligible(num);
    }
}

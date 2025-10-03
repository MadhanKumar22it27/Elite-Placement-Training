import java.util.Scanner;
public class Practice2 {
    public static void natureOfNumber(int num){
        if (num > 0) {
            System.out.println(num+" is Positive");
        }
        else if (num == 0) {
            System.out.println(num+" is equal");
        }
        else{
            System.out.println(num+" is Negative");
        }
    }
    public static void largestAmongThree(int a,int b,int c){
        if (a > b) {
            if (a > c) {
                System.out.println(a+" is largest number among them");
            }
            else{
                System.out.println(c+" is largest number among them");
            }
        }
        else{
            if (b > c) {
                System.out.println(b+" is largest number among them");
            }
            else{
                System.out.println(c+" is largest number among them");
            }
        }
    }
    public static void IsVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is vowel");
        }
        else{
            System.out.println(ch+" is consonant");
        }
    }
    public static void gradeSystem(int mark){
        if (mark > 90 && mark <= 100) {
            System.out.println("You obtained 'O' grade");
        }
        else if (mark > 80 && mark <= 90) {
            System.out.println("You obtained 'A' grade");
        }
        else if (mark > 70 && mark <= 80) {
            System.out.println("You obtained 'B' grade");
        }
        else if (mark > 60 && mark <= 70) {
            System.out.println("You obtained 'C' grade");
        }
        else{
            System.out.println("You are Fail !!!!");
        }
    }
    public static void isDivisible(int num){
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println(num+" is divisible by both 5 and 11");
        }
        else{
            if (num % 5 == 0) {
                System.out.println(num+" is divisible by 5 only");
            }
            else if (num % 11 ==0 ) {
                System.out.println(num+" is divisible by 11 only");
            }
            else{
                System.out.println(num+" is not divisible both 5 and 11");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // char ch = sc.nextLine().charAt(0);
        sc.close();
        // natureOfNumber(num);
        // largestAmongThree(num1, num2, num3);
        // IsVowel(ch);
        // gradeSystem(num);
        isDivisible(num);
    }
}

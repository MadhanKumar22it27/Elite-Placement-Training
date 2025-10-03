import java.util.Scanner;
public class PalindromeNumber {
    public static int reverseNum(int a){
        int temp = a;
        int count = 0;
        int digit =0;
        while (temp != 0) {
            temp = temp/ 10;
            digit++;
        }
        temp = a;
        while (temp != 0) {
            int last = temp%10;
            count = count + (last * (int)Math.pow(10, digit-1));
            digit--;
            temp /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int reverse = reverseNum(num);
        System.out.println("\n");
        if (num == reverse) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}

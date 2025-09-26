import java.util.Scanner;
public class Main{
    static int sumOfDivisors(int num){
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                sum += i;
            }
        }
        return sum;
    }
    static boolean decision(int a, int b){
        if((sumOfDivisors(a)/a) == (sumOfDivisors(b)/b)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        if (decision(num1, num2)) {
            System.out.println("It is Friendly Numbers");
        }
        else{
            System.out.println("It is not Friendly numbers");
        }
    }
}
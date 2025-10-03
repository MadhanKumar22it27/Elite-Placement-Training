import java.util.Scanner;
public class Pascal{
    
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int combination(int n,int r){
        return factorial(n) / (factorial(r)*factorial(n-r));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        // System.out.println(combination(row,2));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j)+" ");
            }
            System.out.println();
        }
    }
}
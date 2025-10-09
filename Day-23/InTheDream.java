import java.util.Scanner;
public class InTheDream {
    public static int max(int a,int b){
        if (a < b) {
            return b;
        }
        return a;
    }
    public static int min(int a,int b){
        if (a < b) {
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rFirst = sc.nextInt();
            int kFirst = sc.nextInt();
            int rTotal = sc.nextInt();
            int kTotal = sc.nextInt();

            int rSecond = rTotal - rFirst;
            int kSecond = kTotal - kFirst;

            if (max(rFirst, kFirst) <= 2*(min(rFirst, kFirst)+1) && max(rSecond, kSecond) <= 2*(min(rSecond, kSecond)+1)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

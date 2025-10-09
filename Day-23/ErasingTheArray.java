import java.util.Scanner;
public class ErasingTheArray {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int ops = 1; 
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] == 1 && arr[i] == 0)
                    ops++;
            }

            System.out.println(ops);
        }
        sc.close();
    }
}

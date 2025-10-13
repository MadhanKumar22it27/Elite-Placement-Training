import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[arr[i] - 1] = i + 1;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
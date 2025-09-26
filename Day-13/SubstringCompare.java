import java.util.Arrays;
import java.util.Scanner;

public class SubstringCompare {
    public static String getSmallestAndLargest(String s, int k) {
        int n = s.length() - k + 1;
        String[] subs = new String[n];

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < i + k; j++) {
                temp += s.charAt(j);
            }
            subs[i] = temp;
        }

        Arrays.sort(subs);

        return subs[0] + "\n" + subs[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

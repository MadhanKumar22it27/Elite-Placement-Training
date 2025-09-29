import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next(); 
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder(num);
        for (int r = 0; r < k; r++) {
            int i = 0;
            while (i < sb.length() - 1 && sb.charAt(i) >= sb.charAt(i + 1)) {
                i++;
            }
            sb.deleteCharAt(i);
        }

        System.out.println(sb.toString());
        sc.close();
    }
}

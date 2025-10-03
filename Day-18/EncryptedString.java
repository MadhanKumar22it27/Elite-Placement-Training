import java.util.Scanner;

public class EncryptedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        int n = s.length();
        String encrypted = "";

        for (int i = 0; i < n; i++) {
            encrypted += s.charAt((i + k) % n);
        }

        System.out.println(encrypted);
    }
}

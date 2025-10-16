import java.util.Scanner;

public class TwoArraysAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        String[] word1 = new String[len1];
        for (int i = 0; i < len1; i++) {
            word1[i] = sc.nextLine();
        }
        sc.nextLine();
        int len2 = sc.nextInt();
        String[] word2 = new String[len2];
        for (int i = 0; i < len2; i++) {
            word2[i] = sc.nextLine();
        }
        System.out.println(arrayStringsAreEqual(word1, word2));
        sc.close();
    }
}

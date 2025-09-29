import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        String word = "codeforces";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != input.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

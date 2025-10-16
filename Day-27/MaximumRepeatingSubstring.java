import java.util.Scanner;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.nextLine();
        String word = sc.nextLine();
        sc.close();
        int count = 0;
        String temp = word;
        
        while (sequence.contains(temp)) {
            count++;
            temp += word;
        }
        System.out.println(count);
    }
}

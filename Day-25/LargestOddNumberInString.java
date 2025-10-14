import java.util.Scanner;

public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        StringBuilder str = new StringBuilder(num);
        for(int i=str.length()-1; i>=0; i--){
            int last = Integer.parseInt(Character.toString(str.charAt(str.length() - 1)));
            if(last%2 != 0){
                return new String(str);
            }
            str.deleteCharAt(str.length()-1);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        sc.close();
        System.out.println(largestOddNumber(num));
    }
}

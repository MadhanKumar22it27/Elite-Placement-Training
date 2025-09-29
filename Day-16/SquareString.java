import java.util.Scanner;

public class SquareString {
    static boolean squareCheck(String input){
        int j=0;
        for (int i = (input.length()/2); i < input.length(); i++) {
            if(input.charAt(j) != input.charAt(i)){
                return false;
            }
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            if (input.length() % 2 == 0) {
                if (squareCheck(input)) {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

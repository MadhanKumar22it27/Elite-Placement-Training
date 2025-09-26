import java.util.Scanner;

public class StringIntroduction {
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int len = (A.length())+(B.length());
        System.out.println(len);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(capitalizeFirstLetter(A)+" "+capitalizeFirstLetter(B));
        sc.close();
    }
}

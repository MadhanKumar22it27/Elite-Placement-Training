import java.util.Scanner;
public class IsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        sc.close();

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is vowel");
        }
        else if (ch >= '1' && ch <= '9') {
            System.out.println(ch+" is a number");
        }
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch+" is a consonant");
        }
        else{
            System.out.println("'"+ch+"'"+" is a special character");
        }
    }
}

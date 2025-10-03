import java.util.Scanner;
public class Practice3 {
    public static void dayName(int num){
        switch (num) {
            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Invaild choice, please enter between 1 and 7");
                break;
        }
    }
    public static void arithmetic(int a,int b,char ch){
        switch (ch) {
            case '+':
                System.out.println("The Addition of "+a+" and "+b+ " is "+ (a+b));
                break;
            case '-':
                System.out.println("The Subtraction of "+a+" and "+b+ " is "+ (a-b));
                break;
            case '*':
                System.out.println("The Multiplication of "+a+" and "+b+ " is "+ (a*b));
                break;
            case '/':
                System.out.println("The Division of "+a+" and "+b+ " is "+ (a/b));
                break;
            default:
                System.out.println("Invalid choice, choose the operator in (+,-,*,/)");
                break;
        }
    }
    public static void monthName(int num){
        switch (num) {
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is Febuaruy");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
            default:
                System.out.println("Invaild choice, please enter between 1 and 12");
                break;
        }
    }
    public static void isVowel(char ch){
        switch (ch) {
            case 'a':
                System.out.println("It is Vowel");
                break;
            case 'e':
                System.out.println("It is Vowel");
                break;
            case 'i':
                System.out.println("It is Vowel");
                break;
            case 'o':
                System.out.println("It is Vowel");
                break;
            case 'u':
                System.out.println("It is Vowel");
                break;
            default:
                System.out.println("It is Consonant");
                break;
        }
    }
    public static void VehicleType(String str){
        switch (str) {
            case "bike":
                System.out.println("Land Type, Two Wheeler");
                break;
            case "car":
                System.out.println("Land Type, Four Wheeler");
                break;
            case "truck":
                System.out.println("Land Type, Heavy Vehicle");
                break;
            case "airplane":
                System.out.println("Air Type");
                break;
            case "ship":
                System.out.println("Water Type");
                break;
            case "boat":
                System.out.println("Water Type");
                break;
            case "train":
                System.out.println("Railway Type");
                break;
            default:
                System.out.println("Invaild choice");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // sc.nextLine();
        // char operator = sc.nextLine().charAt(0);
        // int month = sc.nextInt();
        // char ch = sc.nextLine().charAt(0);
        String vehicle = sc.nextLine().toLowerCase();
        sc.close();
        // dayName(day);
        // arithmetic(num1,num2,operator);
        // monthName(month);
        // isVowel(ch);
        VehicleType(vehicle);
    }
}

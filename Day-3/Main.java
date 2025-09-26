import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        sc.close();
        int temp = number,digits=0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        if(number < 0){
            System.out.println("This is negative number");
        }
        else if(digits != 4){
            System.out.println("Number should be exactly 4 digits only");
        }
        else{
            int first = number / 1000;
            int last = number % 10;
            System.out.println(first+last);
        }
    }
}

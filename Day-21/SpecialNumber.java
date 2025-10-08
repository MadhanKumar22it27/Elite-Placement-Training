import java.util.Scanner;

public class SpecialNumber {
    static boolean fourChecker(int num){
        int sum=0;
        while(num != 0){
            sum += (num%10);
            num = num/10;
        }
        if(sum%4 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int num = sc.nextInt();
            if(fourChecker(num)){
                System.out.println(num);
            }
            else{
                int temp = num+1;
                while(true){
                    if(fourChecker(temp)){
                        System.out.println(temp);
                        break;
                    }
                    temp++;
                }
            }
       }
       sc.close();
    }
}

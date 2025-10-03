import java.util.Scanner;
public class PermutationDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
        int len = s.length();
        int sum = 0;
        int diff = 0;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(s.charAt(i) == t.charAt(j)){
                    diff = i - j;
                    if(diff < 0){
                        diff *= -1;
                    }
                    sum += diff;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}


import java.util.Scanner;

public class Blinds {
    static int max(int a,int b){
        return (a < b) ? b : a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();  
        int min = sc.nextInt(); 
        int[] arr = new int[len];
        int maxlen = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            maxlen = max(maxlen, arr[i]);
        }
        sc.close();

        int maxArea = 0;

        if (maxlen >= min) {  
            for (int d = min; d <= maxlen; d++) { 
                int pieces = 0;
                for (int l : arr) {
                    pieces += l / d;  
                }
                int area = pieces * d;
                maxArea = Math.max(maxArea, area);
            }
        }

        System.out.println(maxArea);
    }
}

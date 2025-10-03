import java.util.Scanner;

public class MinimumNumberOfChairs {
    static int max(int a,int b){
        if(a < b){
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int curr = 0;       
        int maxChairs = 0;  
        
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                curr++;
                maxChairs = max(maxChairs, curr);
            } else { 
                curr--;
            }
        }
        System.out.println(maxChairs);
    }
}

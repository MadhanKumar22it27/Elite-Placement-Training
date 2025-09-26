import java.util.Scanner;
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int sum=0;
        
        for (int i = 0; i < n; i++) {
            int person = sc.nextInt();
            if (person <= h) {
                sum+=1;
            }
            else{
                sum+=2;
            }
        }
        sc.close();
        System.out.println(sum);
    }
}

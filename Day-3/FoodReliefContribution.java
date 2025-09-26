import java.util.Scanner;
public class FoodReliefContribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float senior = sc.nextFloat();
        float junior = sc.nextFloat();
        sc.close();
        
        System.out.printf("%.2f",(((50.00/100.00)*senior)*6.00)+(((40.00/100.00)*junior)*5.00));
    }
}
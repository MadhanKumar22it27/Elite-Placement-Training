import java.util.Scanner;

public class WaterBottles {
     public static int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int empty = 0;
        int full = numBottles;
        while (full > 0) {
            totalDrank += full;         
            empty += full;              
            full = empty / numExchange; 
            empty = empty % numExchange;
        }
        return totalDrank;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        System.out.println(numWaterBottles(numBottles, numExchange));
        sc.close();
    }
}

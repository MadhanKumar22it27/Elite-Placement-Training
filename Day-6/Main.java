import java.util.Scanner;
public class Main {
    public static void calculate(int exist, int adult, int child){
        int sum = (adult*75) + (child*50);
        if(exist >= sum){
            System.out.println("Boat is Stable");
        }
        else{
            System.out.println("Boat will drown");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exist = sc.nextInt();
        int adult = sc.nextInt();
        int child = sc.nextInt();
        sc.close();
        calculate(exist,adult,child);
    }
}

import java.util.Scanner;
public class TwoQuestions {
    public static void heatingTime(int items,float heat){
        if (items == 1) {
            System.out.println("The recommended time is "+heat);
        }
        else if (items == 2) {
            System.out.println("The Recommended time is "+(((50.0/100.0)*heat)+heat));
        }
        else if (items == 3) {
            System.out.println("The Recommeded time is "+(heat*2));
        }
        else{
            System.out.println("The time is not recommended");
        }
    }
    public static void MangoTree(int row,int col,int num){
        if ((num%col == 2) || (num%col == (col-1)) || ( (num >= (col*(row-2))+1) && (num<=(col*(row-1))))) {
            System.out.println("It is Mango Tree");
        }
        else{
            System.out.println("It is not Mango tree");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int items = sc.nextInt();
        // float heat = sc.nextFloat();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int num = sc.nextInt();
        sc.close();
        // heatingTime(items, heat);
        MangoTree(row, col, num);
    }
}

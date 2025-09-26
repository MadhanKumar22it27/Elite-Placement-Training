import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float item1Price = sc.nextFloat();
        float item2Price = sc.nextFloat();
        float percent = sc.nextInt();
        sc.close();

        float total = item1Price+item2Price;
        float reduce = (percent/100)*total;
        System.out.println("Output");
        System.out.printf("%.2f\n",total);
        System.out.println(total-reduce);
        System.out.println(reduce);
    }
}

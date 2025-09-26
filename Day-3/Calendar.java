import java.util.*;
public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input/365);
        System.out.println((input%365) / 7);
        System.out.println((input%365) % 7);
        sc.close();
    }
}

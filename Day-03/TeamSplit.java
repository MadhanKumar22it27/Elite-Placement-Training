import java.util.Scanner;

public class TeamSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int size = sc.nextInt();
        System.out.println("The number of students in each team is "+total/size+" and left out is "+total%size);
        sc.close();
    }
}

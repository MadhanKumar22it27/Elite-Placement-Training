import java.util.Scanner;

public class TomRiddlesDiary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[t];
        int i = 0;
        while (i < t) {
            arr[i] = sc.nextLine();
            String temp = arr[i];
            boolean ispresent = false;
            for (int j = 0; j < i; j++) {
                if (temp.equals(arr[j])) {
                    ispresent = true;
                    break;
                }
            }

            if (ispresent) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            i++;
        }

        sc.close();
    }
}

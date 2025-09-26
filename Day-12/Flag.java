import java.util.Scanner;
public class Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        sc.nextLine();

        char[] rowColors = new char[n]; 
        boolean isValid = true;

        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            char firstChar = row.charAt(0);
            for (int j = 1; j < m; j++) {
                if (row.charAt(j) != firstChar) {
                    isValid = false; 
                }
            }

            rowColors[i] = firstChar;
        }
        for (int i = 1; i < n; i++) {
            if (rowColors[i] == rowColors[i - 1]) {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[row][col];
        for (int i = 0; i < row; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }
        int top = row, bottom = -1, left = col, right = -1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == '*') {
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }
        for (int i = top; i <= bottom; i++) {
            for (int j = left; j <= right; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}

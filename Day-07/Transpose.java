import java.util.Scanner;
public class Transpose {
    public static void DisplayMatrices(int row,int col,int[][] arr){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] transpose = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = mat[j][i];
            }
        }
        DisplayMatrices(row, col,mat);
        System.out.println();
        DisplayMatrices(col,row,transpose);
    }
}

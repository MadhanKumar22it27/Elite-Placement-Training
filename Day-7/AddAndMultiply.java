import java.util.Scanner;
public class AddAndMultiply {
    public static void AddMatrices(int row,int col,int[][] arr1, int[][] arr2){
        int[][] add = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        DisplayMatrices(row, col, add);
    }
    public static void DisplayMatrices(int row,int col,int[][] arr){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void MulMatrices(int row,int col,int[][] arr1, int[][] arr2){
        int[][] mul = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for(int k=0; k<col; k++){
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        DisplayMatrices(row, col, mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matA = new int[row][col];
        int[][] matB = new int[row][col];
        System.out.println("Enter the elements for Matrix A");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements for Matrix B");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matB[i][j] = sc.nextInt();
            }
        } 
        sc.close();
        System.out.println();
        AddMatrices(row,col,matA,matB);
        MulMatrices(row, col, matA, matB);
    }
}

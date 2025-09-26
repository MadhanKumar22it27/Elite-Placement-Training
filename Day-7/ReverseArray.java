import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] rArr = new int[len];
        int j=0;
        for (int i = len-1; i >=0; i--) {
            rArr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < rArr.length; i++) {
            System.out.print(rArr[i]+" ");
        }
    }
}

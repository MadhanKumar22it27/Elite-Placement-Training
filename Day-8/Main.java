import java.util.Scanner;
public class Main {
    public static void display(int[] arr,int len){
        for (int i=0; i<len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sum(int[] arr, int size){
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("The Sum of all elements is "+sum);
    }
    public static void evenOdd(int[] arr,int size){
        int even=0,odd=0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of even numbers is "+even+" and odd numbers is "+odd);
    }
    public static void search(int[] arr,int size,int target){
        for (int i = 0; i < size; i++) {
            if(arr[i] == target){
                System.out.println("The given number is found at the "+i+"th index");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        // int target = sc.nextInt();
        sc.close();
        // display(arr, len);
        // sum(arr, len);
        // evenOdd(arr, len);
        // search(arr, len, target);
    }
}

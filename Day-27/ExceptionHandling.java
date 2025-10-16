import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        int[] myArray = null;
        try {
            int value = myArray[0];
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            System.out.println(arr[5]/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch(Exception e){
            System.out.println(e);
        }

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}

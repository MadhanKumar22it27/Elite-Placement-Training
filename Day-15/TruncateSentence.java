import java.util.Scanner;
class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String[] duplicate = new String[k];
        for(int i=0; i<k; i++){
            duplicate[i] = arr[i];
        }
        return String.join(" ", duplicate);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt(); 
        sc.close();
        System.out.println(truncateSentence(str,k));
    }
}
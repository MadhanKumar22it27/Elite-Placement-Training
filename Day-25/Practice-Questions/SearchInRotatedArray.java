import java.util.Scanner;

public class SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(nums, target));
        sc.close();
    }
}

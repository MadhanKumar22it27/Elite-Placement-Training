import java.util.*;

public class LongestSubstringWithoutRepitition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLen = 0;
        int start = 0;
        int[] last = new int[128];
        Arrays.fill(last, -1); 
        for(int end = 0; end < s.length(); end++){
            char c = s.charAt(end);
            if(last[c] >= start){
                start = last[c] + 1;
            }
            last[c] = end;
            maxLen = Math.max(maxLen,(end-start+1));
        }
        System.out.println(maxLen);
        sc.close();
    }
}

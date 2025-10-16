import java.util.*;

public class AandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            System.out.println(minSwaps(s));
        }
    }

    static long minSwaps(String s) {
        List<Integer> aPos = new ArrayList<>();
        List<Integer> bPos = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') aPos.add(i);
            else bPos.add(i);
        }
        long aMoves = calc(aPos);
        long bMoves = calc(bPos);

        return Math.min(aMoves, bMoves);
    }

    static long calc(List<Integer> pos) {
        int n = pos.size();
        if (n <= 1) return 0L;

        int mid = n / 2;
        int median = pos.get(mid);
        long moves = 0L;
        for (int i = 0; i < n; i++) {
            long target = (long)median - mid + i;   
            moves += Math.abs(pos.get(i) - target);
        }
        return moves;
    }
}

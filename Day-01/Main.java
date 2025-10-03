public class Main{
    public static int ToggleBulbs(int state, int n) {
        // find integer square root
        int root = (int) Math.sqrt(n);

        // if n is a perfect square -> odd divisors -> toggle
        if (root * root == n) {
            return (state == 1) ? 0 : 1; // flip
        } else {
            return state; // unchanged
        }
    }

    public static void main(String[] args) {
        int state = 0;
        int n = 10;
        System.out.println(ToggleBulbs(state, n)); // Output: 1
    }
}
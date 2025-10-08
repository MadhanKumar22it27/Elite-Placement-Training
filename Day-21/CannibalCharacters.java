import java.io.*;
public class CannibalCharacters{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int T = Integer.parseInt(line.trim());
        while (T-- > 0) {
            // read n (we don't actually need it, but consume the line)
            String nLine = br.readLine();
            while (nLine != null && nLine.trim().isEmpty()) nLine = br.readLine();
            if (nLine == null) break;
            // read string s
            String s = br.readLine();
            while (s != null && s.trim().isEmpty()) s = br.readLine();
            if (s == null) s = "";
            s = s.trim();
            System.out.println(minOperations(s));
        }
    }

    static int minOperations(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') freq[c - 'a']++;
        }
        int ops = 0;
        for (int f : freq) ops += f / 2;
        return ops;
    }
} 

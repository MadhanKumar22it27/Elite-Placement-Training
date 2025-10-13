import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<>();
        String result = "";

        for (String word : words) {
            if (word.length() == 1 || built.contains(word.substring(0, word.length() - 1))) {
                built.add(word);
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String[] str = {"w","wo","wor","worl","world"};
        System.out.println(longestWord(str));
    }
}

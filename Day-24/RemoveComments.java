import java.util.ArrayList;
import java.util.List;

public class RemoveComments {
    public static List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean inBlock = false;
        StringBuilder newLine = new StringBuilder();

        for (String line : source) {
            int i = 0;
            char[] chars = line.toCharArray();

            if (!inBlock) newLine = new StringBuilder();

            while (i < chars.length) {
                if (!inBlock && i + 1 < chars.length && chars[i] == '/' && chars[i + 1] == '*') {
                    inBlock = true;
                    i += 2;
                } else if (inBlock && i + 1 < chars.length && chars[i] == '*' && chars[i + 1] == '/') {
                    inBlock = false;
                    i += 2;
                } else if (!inBlock && i + 1 < chars.length && chars[i] == '/' && chars[i + 1] == '/') {
                    break;
                } else if (!inBlock) {
                    newLine.append(chars[i++]);
                } else {
                    i++;
                }
            }

            if (!inBlock && newLine.length() > 0) {
                result.add(newLine.toString());
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        System.out.println(removeComments(source));
    }
}

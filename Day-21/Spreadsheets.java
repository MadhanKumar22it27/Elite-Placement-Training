import java.util.*;
import java.util.regex.*;

public class Spreadsheets {

    static String numToCol(int col) {
        StringBuilder sb = new StringBuilder();
        while (col > 0) {
            col--;
            sb.insert(0, (char)('A' + (col % 26)));
            col /= 26;
        }
        return sb.toString();
    }

    static int colToNum(String col) {
        int num = 0;
        for (char c : col.toCharArray()) {
            num = num * 26 + (c - 'A' + 1);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        Pattern pattern = Pattern.compile("^R(\\d+)C(\\d+)$");

        while (t-- > 0) {
            String s = sc.nextLine();
            Matcher matcher = pattern.matcher(s);

            if (matcher.matches()) {
                int row = Integer.parseInt(matcher.group(1));
                int col = Integer.parseInt(matcher.group(2));
                System.out.println(numToCol(col) + row);
            } else {
                Matcher m2 = Pattern.compile("^([A-Z]+)(\\d+)$").matcher(s);
                if (m2.matches()) {
                    String colPart = m2.group(1);
                    String rowPart = m2.group(2);
                    int colNum = colToNum(colPart);
                    System.out.println("R" + rowPart + "C" + colNum);
                }
            }
        }
        sc.close();
    }
}

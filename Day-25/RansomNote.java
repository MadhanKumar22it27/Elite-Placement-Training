import java.util.Scanner;

public class RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();
        sc.close();
        boolean flag = true;
        for(int i=0; i<ransomNote.length(); i++){
            String ch = Character.toString(ransomNote.charAt(i));
            if(!magazine.contains(ch)){
                flag = false;
            }
            magazine = magazine.replaceFirst(ch, "");
       }
       System.out.println(flag);
    }
}

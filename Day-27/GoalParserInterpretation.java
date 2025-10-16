import java.util.Scanner;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        sc.close();
        int i=0;
        String str = "";
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                str+='G';
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str+='o';
                i+=2;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                str+="al";
                i+=4;
            }
        }
        System.out.println(str);
    }
}

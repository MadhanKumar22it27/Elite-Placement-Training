import java.util.Scanner;

class College {
    int friends = 4;
    void classroom(String place){
        System.out.println("I am in "+place);
    }
}
class Student extends College{
    float marks = 7.55f;
    void name(String myName){
        System.out.println("My name is "+myName);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myName = sc.nextLine();
        String place = sc.nextLine();
        sc.close();
        Student student = new Student();
        student.name(myName);
        System.out.println(student.marks);
        student.classroom(place);
        System.out.println(student.friends);
    }
}
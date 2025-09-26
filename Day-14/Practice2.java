import java.util.Scanner;
class StudentMark{
    void mark(String name,int marks){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int marks = sc.nextInt();
        sc.close();
        StudentMark student1 = new StudentMark();
        student1.mark(name,marks);
    }
}

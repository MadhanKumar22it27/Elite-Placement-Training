abstract class Parent{
    void display(){
        System.out.println("I am from Abstract class");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("I am from Child Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
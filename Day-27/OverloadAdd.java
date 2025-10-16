class OverloadDisplay {
    void display(){
        System.out.println("This is from No parameter method");
    }
    void display(String str){
        System.out.println("This is from single string parameter "+"\""+str+"\"");
    }
    void display(String str,int n){
        System.out.println("This is from one string parameter \""+str+"\" and one int parameter \'"+n+"\'");
    }
}
class OverloadArea {
    public double area(double a){
        return 3.14*a*a;
    }
    public int area(int a,int b){
        return a*b;
    }
    public int area(int a){
        return a*a;
    }
}
class InnerOverloadAdd {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class OverloadAdd {
    public static void main(String[] args) {
        InnerOverloadAdd in = new InnerOverloadAdd();
        System.out.println(in.add(1.1,2.2));
        OverloadArea shape = new OverloadArea();
        System.out.println(shape.area(4));
        System.out.println(shape.area(4.0));
        System.out.println(shape.area(4,5));
        OverloadDisplay print = new OverloadDisplay();
        print.display();
        print.display("java");
        print.display("java",5);
    }
}

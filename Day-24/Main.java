public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } 
        catch(ArithmeticException e){
            System.out.println("It's arthmetic exception");
        }
        catch (Exception e) {
            System.out.println("it's very wrong bro");
        }
    }
}

import java.util.Scanner;
class Car {
    void details(String brand,String model){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String model = sc.nextLine();
        sc.close();
        Car car = new Car();
        car.details(brand, model);
    }
}

import java.util.Scanner;
public class GoingToOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long d = sc.nextLong();
       long oc = sc.nextLong();
       long of = sc.nextLong();
       long od = sc.nextLong();
       long cs = sc.nextLong();
       long cb = sc.nextLong();
       long cm = sc.nextLong();
       long cd = sc.nextLong();
       long online = oc+((d-of)*od);
       long classic = cb + ((d/cs)*cm) + (d*cd);
       if(online <= classic){
        System.out.println("Online Taxi");
       }
       else{
        System.out.println("Classic Taxi");
       }
       sc.close();
    }
}

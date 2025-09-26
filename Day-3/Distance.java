import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextInt();
        float y1 = sc.nextInt();
        float x2 = sc.nextInt();
        float y2 = sc.nextInt();
        sc.close();
        float midpointX = ((x1+x2)/2);
        float midpointY = ((y1+y2)/2);
        System.out.println("Binoy's house is located at ("+midpointX+","+midpointY+")");
    }
}

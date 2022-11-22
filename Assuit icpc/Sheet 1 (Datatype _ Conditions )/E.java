import java.util.Scanner;
import java.lang.Math;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double π = Math.PI;
        double R = sc.nextDouble();
        double area = π*(Math.pow(R, 2));
        System.out.printf("%.9f" , area);         
    }
}

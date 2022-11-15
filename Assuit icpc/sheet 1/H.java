import java.util.Scanner;
import java.lang.Math;
public class H {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double result = A/B;
        System.out.println("floor " + (int)A + " / " +(int) B + " = " +(int)Math.floor(result));
        System.out.println("ceil " +(int) A + " / " +(int) B + " = " + (int)Math.ceil(result));
        System.out.println("round " +(int) A + " / " + (int)B + " = " + Math.round(result)); 
    }
}

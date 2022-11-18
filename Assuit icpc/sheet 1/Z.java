import java.util.Scanner;
import java.util.function.LongToDoubleFunction;
public class Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        double L = B * Math.log(A);
        double R = D * Math.log(C); 
        if(L>R){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

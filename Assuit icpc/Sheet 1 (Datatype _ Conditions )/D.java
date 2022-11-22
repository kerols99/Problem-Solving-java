import java.util.Scanner;
public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        System.out.println("Difference = " + ((A*B)-(C*D)));
    }
}
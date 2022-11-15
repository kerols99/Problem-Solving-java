import java.util.Scanner;
public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        System.out.println(X + " + " + Y + " = " + (X + Y));
        System.out.println(X + " * " + Y + " = " + (X * Y));
        System.out.println(X + " - " + Y + " = " + (X - Y));
    }
}
import java.util.Scanner;
public class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long Years = N/365 ;
        long Months = (N%365)/30;
        long Days = (N%365)-(Months*30);
        System.out.println(Years + " years");
        System.out.println(Months + " months");
        System.out.println(Days + " days");
    }
}

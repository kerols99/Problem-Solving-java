import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if((X/1000)%2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
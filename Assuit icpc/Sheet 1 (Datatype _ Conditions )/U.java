import java.util.Scanner;
public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float N = sc.nextFloat();
        if(N != (int)N){
            System.out.println("float " + (int)N + " " +(N-(int)N));
        }else{
            System.out.println( "int " +((int)N));
        }
    }
}
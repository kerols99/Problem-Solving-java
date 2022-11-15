import java.util.Scanner;
public class G {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        // (2*(2+1))\2 = 3 , (4*(4+1))\2 = 10 , (8*(8+1))\2 = 36 , (9*(9+1))\2 = 45 , (10*(10+1))\2 = 55 
        long sum = ((N *(N+1))/2);
        System.out.println(sum);
    }
}

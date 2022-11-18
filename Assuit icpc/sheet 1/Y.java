import java.util.Scanner;
public class Y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long Result = (A%100*B%100*C%100*D%100)%100 ;
        if(Result<=9){
            System.out.println("0"+ Result%100);
        }else{
            System.out.println(Result);
        }
    }
}
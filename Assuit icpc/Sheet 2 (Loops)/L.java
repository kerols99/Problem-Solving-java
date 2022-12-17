import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        while (B!=0){
            A=A%B;
            int K=A;
            A=B;
            B=K;
        }
        System.out.println(A);
    }
}
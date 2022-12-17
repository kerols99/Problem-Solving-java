import java.util.Scanner;   
public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Sum = 0;
        for (int i = 1; i <= N; i++) {
            int K = i; 
            int S = 0;
            while (K>0){
                int O = K % 10 ;
                S+= O;
                K /= 10;
            }
            if (A <= S && S <= B) {
                Sum += i ;
            }
        }
        System.out.println(Sum);
    }
}

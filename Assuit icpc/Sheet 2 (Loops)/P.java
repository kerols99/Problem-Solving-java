import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int K = i ;
            while(K<=N){
                System.out.printf('*' + "");
                K++;
            }
            System.out.printf("\n");
        }
    }
}
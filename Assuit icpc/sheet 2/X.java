import java.util.Scanner;
public class X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            long sum = 0;
            int N = sc.nextInt();
            int O = 0;
            while(N != 0){
                if(N%2 == 1){
                    O++;
                }
                 N/=2;
            }
            for (int j = 0; j < O; j++) {
                sum += Math.pow(2, j);
            }
            System.out.println(sum);
        }
    }    
}

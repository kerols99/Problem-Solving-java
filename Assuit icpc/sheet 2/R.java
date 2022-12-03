import java.util.Scanner;
public class R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N<=0 || M<=0) break;
            int X = Math.min(N,M);
            int Y = Math.max(N,M);
            int sum = 0;
            for (int i = X; i<=Y; i++) {
                System.out.printf(i+" ");
                sum +=i;
            }
            System.out.printf(" sum =" + sum + "\n");
        }
    }
}
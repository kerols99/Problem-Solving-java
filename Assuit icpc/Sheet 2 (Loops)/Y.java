import java.util.Scanner;
public class Y {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+3];
        A[0]=0;
        A[1]=1;
        for (int i = 2; i < N; i++) {
            if (i == 1) {
                System.out.println(A[i]);
            }else{
            A[i]=A[i-1]+A[i-2];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf(A[i]+" ");
        }
    }
}   

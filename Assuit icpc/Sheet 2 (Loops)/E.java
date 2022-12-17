import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int min =0;
        for(int i = 0 ; i<A.length; i++){
            A[i] = sc.nextInt();
            min = Math.max(min, A[i]) ;
        }
        System.out.println(min);
    }
}
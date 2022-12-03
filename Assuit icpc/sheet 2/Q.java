import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        String[] A = new String[N]; 
        for(int i = 0 ; i<N; i++){
            A[i] = sc.next();
        }
        for(int j = 0; j<A.length; j++){
            for(int k =A[j].length(); k>=1; k--) {
                System.out.printf(A[j].charAt(k-1)+" ");
            }
            System.out.printf("\n");
        }
    }
}

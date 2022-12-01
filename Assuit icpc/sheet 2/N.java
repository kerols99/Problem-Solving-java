import java.util.Scanner;
public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int k = 0; k < A.length; k++) {
            int l = A[k];
            while (l > 0) {
                if (C == '+') {
                    System.out.printf(C + "");

                }else if(C == '-'){
                    System.out.printf(C + "");
                }else if(C == '*'){
                    System.out.printf(C + "");
                }else if(C == '/'){
                    System.out.printf(C + "");
                }
                l--;
            }
            System.out.printf("\n");
        }
    }
}

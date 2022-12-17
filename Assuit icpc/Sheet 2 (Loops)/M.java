import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean F = false; 
        for (int i = A; i <= B; i++) {
            int O = i;
            boolean F2 = false;
            while (O > 0) {
                int K = O % 10;
                if (K != 7 && K != 4) {
                    F2 = true;
                }
                O /= 10;
            }
            if (!F2) {
                System.out.printf(i+ " ");          
                F = true;
            }
        }
        if(!F){
            System.out.println(-1);
        }
    }
}

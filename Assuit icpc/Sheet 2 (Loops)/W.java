import java.util.Scanner;
public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        for (int i = N; i >= 1; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}

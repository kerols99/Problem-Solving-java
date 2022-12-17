import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++)
                System.out.printf(" ");
            for (int k = 0; k < (2 * i) - 1; k++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}

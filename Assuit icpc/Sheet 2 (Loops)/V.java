import java.util.Scanner;
public class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= (N * 4); i++) {
            if (i % 4 != 0) {
                System.out.printf(i + " ");
            }
            if (i % 4 == 0) {
                System.out.printf("PUM\n");
            }
        }
    }
}

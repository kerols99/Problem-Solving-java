import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1) {
            System.out.println("-1");
        } else {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
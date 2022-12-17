import java.util.Scanner;
public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = Math.min(A, B);
            X ++ ;
            int Y = Math.max(A, B);
            long sum = 0;
            for (int i = X; i < Y; i++) {
                if (i % 2 == 0) {
                } else {
                    sum += i;
                }
            }
            System.out.println(sum);
            N--;
        }

    }
}

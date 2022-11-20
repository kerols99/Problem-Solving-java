import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long Fact= 1;
        for (int i = 0; i < N; i++) {
           int A = sc.nextInt();
           Fact = 1;
            for (int j = 1; j <=A; j++) {
                Fact *=j;
            }
            System.out.println(Fact);
        }
    }
}

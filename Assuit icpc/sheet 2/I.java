import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = Integer.toString(N);
        String A = "";
        for(int i = S.length()-1; i>=0;i--){
            A+=S.charAt(i);
        }
        int B = Integer.parseInt(A);
        System.out.println(B);
        if(B==N){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
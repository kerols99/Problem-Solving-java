import java.util.Scanner;
public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int O = 0;
        for(int i = 1; i<=N/2; i++){
            if(N%i == 0)
                O++;
        }
        if(O==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
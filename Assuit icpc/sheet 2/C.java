import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = 0 ;
        int O = 0 ;
        int P = 0 ;
        int Ne = 0 ;
        for(int i = 1; i<=N ; i++){
            int A = sc.nextInt();
            if(A%2 == 0){
                E += 1;
            }else {
                O += 1;
            }
            if(A>0 && A!=0){
                P += 1;
            }else if(A<0 && A!=0){
                Ne += 1;
            }
        }
        System.out.println("Even: " + E);
        System.out.println("Odd: " + O);
        System.out.println("Positive: " + P);
        System.out.println("Negative: " + Ne);
    }
}

import java.util.Scanner;
public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();
        char Q = sc.next().charAt(0);
        int C = sc.nextInt();
        if(S == '+' && Q == '='){
            if((A + B) == C){
                System.out.println("Yes");
            }else{
                System.out.println(A + B);
            }
        }else if(S == '-' && Q == '='){
            if((A - B) == C){
                System.out.println("Yes");
            }else{
                System.out.println(A - B);
            }
        }else if(S == '*' && Q == '='){
            if((A*B) == C){
                System.out.println("Yes");
            }else{
                System.out.println(A * B);
            }
        }
    }
}

import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        if(A<=B && A<=C && B<=C){
            System.out.println(A + "\n" + B + "\n" + C + "\n");
        }else if(A<=B && A<=C && C<=B){
            System.out.println(A + "\n" + C + "\n" + B + "\n");
        }else if(B<=A && B<=C && A<=C){
            System.out.println(B + "\n" + A + "\n" + C + "\n");
        }else if(B<=A && B<=C && C<=A){
            System.out.println(B + "\n" + C + "\n" + A + "\n");
        }else if(C<=A && C<=B && A<=B){
            System.out.println(C + "\n" + A + "\n" + B + "\n");
        }else if(C<=A && C<=B && B<=A){
            System.out.println(C + "\n" + B + "\n" + A + "\n");
        }
        System.out.println(A + "\n" + B + "\n" + C);
    }
}
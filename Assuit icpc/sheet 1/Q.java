import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        if(X>0 && Y>0){
            System.out.println("Q1");
        }else if(X<0 && Y>0){
            System.out.println("Q2");
        }else if(X<0 && Y<0){
            System.out.println("Q3");
        }else if(X>0 && Y<0){
            System.out.println("Q4");
        }else if(X==0 && Y==0){
            System.out.println("Origem");
        }else if(Y==0){
            System.out.println("Eixo X");
        }else if(X==0){
            System.out.println("Eixo Y");
        }
    }
}

import java.util.Scanner;
public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Alphabet = sc.next().charAt(0);
        if(Alphabet >= 64 && Alphabet <= 96){
            System.out.println("ALPHA\nIS CAPITAL");
        }else if(Alphabet >= 97 && Alphabet <= 127){
            System.out.println("ALPHA\nIS SMALL");   
        }else if(Alphabet >= 48 && Alphabet <= 57){
            System.out.println("IS DIGIT");   
        }
    }
}
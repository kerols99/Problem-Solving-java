import java.util.Scanner;
public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Alphabet = sc.next().charAt(0);
        if(Alphabet >= 64 && Alphabet <= 96 ){
            Alphabet += 32;
            System.out.println(Alphabet);
        }else if(Alphabet >= 97 && Alphabet <= 127 ){
            Alphabet -= 32;
            System.out.println(Alphabet);
        }
    }
}
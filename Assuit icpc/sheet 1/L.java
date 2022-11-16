import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FirstName1 = sc.next();
        String SecondName1 = sc.next();
        String FirstName2 = sc.next();
        String SecondName2 = sc.next();
        if(SecondName1.equals(SecondName2)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }
    }
}
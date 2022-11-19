import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 0;
        for(int i = 1; 1<2 ; i++){
            pass =  sc.nextInt();
            if(pass == 1999){
                System.out.println("Correct");
                break;
            }else{
                System.out.println("Wrong");
            }
        }
    }
}

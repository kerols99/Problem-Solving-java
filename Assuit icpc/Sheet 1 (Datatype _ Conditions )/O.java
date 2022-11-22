import java.util.Scanner;
public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        char S = ' ';
        for (int i = 0; i<X.length(); i++){
            S = X.charAt(i);
            if (S == '+'){
                System.out.println(Integer.parseInt(X.substring(0, i)) + Integer.parseInt(X.substring(i+1)));
            }else if(S == '-'){
                System.out.println(Integer.parseInt(X.substring(0, i)) - Integer.parseInt(X.substring(i+1)));
            }else if(S == '*'){
                System.out.println(Integer.parseInt(X.substring(0, i)) * Integer.parseInt(X.substring(i+1)));  
            }else if (S == '/'){
                System.out.println(Integer.parseInt(X.substring(0, i)) / Integer.parseInt(X.substring(i+1)));
            }   
        }
      
    }
}
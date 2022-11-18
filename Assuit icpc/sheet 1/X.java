import java.util.Scanner;
public class X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L1 = sc.nextLong();
        long R1 = sc.nextLong();
        long L2 = sc.nextLong();
        long R2 = sc.nextLong();
        if(L2 > R1 && R2 > L1 || L2 < R1 && R2 < L1){
            System.out.println(-1);
        }else{
            System.out.println(Math.max(L1 , L2) + " " +Math.min(R1 , R2) );
        }
    }
}

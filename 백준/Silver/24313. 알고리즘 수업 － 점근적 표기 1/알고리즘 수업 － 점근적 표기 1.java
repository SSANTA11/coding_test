import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long c = sc.nextLong();
        long n0 = sc.nextLong();
        // f= a1n+a2
        
        if ((a1 * n0 + a2 <= c * n0) && (c >= a1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}
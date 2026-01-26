import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int M = A*B*C;
        String target = String.valueOf(M);
        for(int i =0;i<10;i++){
            int c=0;
            for(char e: target.toCharArray()){
                if(e==i+'0'){
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}
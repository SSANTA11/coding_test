import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int H=sc.nextInt();
            int W=sc.nextInt();
            int N=sc.nextInt();
            int a=N%H;
            int b=N/H+1;
            if(a%H==0){
                b=b-1;
            }
            if(a==0){
                a=H;
            }
            if(b>=10){
                System.out.print(a);
                System.out.println(b);
            }else{
                System.out.print(a);
                System.out.print(0);
                System.out.println(b);
            }
        }
    }
}